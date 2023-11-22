package prova2.pratica.contas;

import prova2.pratica.abstratas.Conta;
import prova2.pratica.abstratas.Pessoa;
import prova2.pratica.funcionarios.Gerente;

public class ContaCorrente extends Conta {
    private Double taxaServicos;

    public ContaCorrente(){}

    public ContaCorrente(Pessoa titular, Gerente gerente){
        super(titular, gerente);
    }

    public ContaCorrente(Pessoa titular, Gerente gerente, String numero, String agencia){
        super(titular, gerente, numero, agencia);
    }

    public ContaCorrente(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo){
        super(titular, gerente, numero, agencia, saldo);
    }

    public ContaCorrente(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo, Double taxaServicos){
        super(titular, gerente, numero, agencia, saldo);
        this.taxaServicos = taxaServicos;
    }

    public Double getTaxaServicos() {
        return taxaServicos;
    }

    public void setTaxaServicos(Double taxaServicos) {
        this.taxaServicos = taxaServicos;
    }
}
