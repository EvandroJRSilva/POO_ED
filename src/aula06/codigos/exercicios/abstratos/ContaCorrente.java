package aula06.codigos.exercicios.abstratos;

public class ContaCorrente extends ContaBancaria{
    private double taxaAdministrativa, limiteTransferencia;

    public ContaCorrente(){}

    public ContaCorrente(double saldo, String agencia, String numero, String digitoVerificador, String senha,
                         double taxaAdministrativa, double limiteTransferencia){
        super(saldo, agencia, numero, digitoVerificador, senha);
        this.taxaAdministrativa = taxaAdministrativa; this.limiteTransferencia = limiteTransferencia;
    }

    public double getTaxaAdministrativa() {
        return taxaAdministrativa;
    }

    public void setTaxaAdministrativa(double taxaAdministrativa) {
        this.taxaAdministrativa = taxaAdministrativa;
    }

    public double getLimiteTransferencia() {
        return limiteTransferencia;
    }

    public void setLimiteTransferencia(double limiteTransferencia) {
        this.limiteTransferencia = limiteTransferencia;
    }

    @Override
    public void depositar(double valor) {
        saldo -= taxaAdministrativa;
        saldo += valor;
        System.out.println("Seu saldo atual é: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if (valor < limiteTransferencia){
            saldo -= taxaAdministrativa;
            saldo -= valor;

            System.out.println("Seu saldo atual é: " + getSaldo());
        }else System.out.println("O valor solicitado excede o limite de transferência da conta");
    }
}
