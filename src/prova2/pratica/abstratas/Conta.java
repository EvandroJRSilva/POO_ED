package prova2.pratica.abstratas;


import prova2.pratica.funcionarios.Gerente;

public abstract class Conta {
    private Pessoa titular;
    private Gerente gerente;
    private String numero;
    private String agencia;
    private Double saldo;

    public Conta(){}

    public Conta(Pessoa titular, Gerente gerente){
        this.titular = titular;
        this.gerente = gerente;
    }

    public Conta(Pessoa titular, Gerente gerente, String numero, String agencia){
        this.titular = titular;
        this.gerente = gerente;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo){
        this.titular = titular;
        this.gerente = gerente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor){
        this.saldo += saldo;
    }

    public void sacar(Double valor){
        this.saldo -= saldo;
    }
}
