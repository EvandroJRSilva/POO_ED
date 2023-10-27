package aula06.codigos.exercicios.abstratos;

public class ContaPoupanca extends ContaBancaria{
    double juros;

    public ContaPoupanca(){}

    public ContaPoupanca(double saldo, String agencia, String numero, String digitoVerificador, String senha,
                         double juros){
        super(saldo, agencia, numero, digitoVerificador, senha);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void depositar(double valor) {
        saldo += (saldo*juros) + valor;
        System.out.println("Seu novo saldo é: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Seu saldo atual é: " + getSaldo());
    }
}
