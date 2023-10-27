package aula06.codigos.exercicios.abstratos;

public abstract class ContaBancaria {
    double saldo;
    String agencia, numero, digitoVerificador, senha;

    public ContaBancaria(){}

    public ContaBancaria(double saldo, String agencia, String numero, String digitoVerificador, String senha) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.digitoVerificador = digitoVerificador;
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
}