package prova2.pratica.contas;

import prova2.pratica.abstratas.Conta;
import prova2.pratica.abstratas.Pessoa;
import prova2.pratica.funcionarios.Gerente;

public class ContaPoupanca extends Conta {
    private Double juros;

    public ContaPoupanca(){}

    public ContaPoupanca(Pessoa titular, Gerente gerente){
        super(titular, gerente);
    }

    public ContaPoupanca(Pessoa titular, Gerente gerente, String numero, String agencia){
        super(titular, gerente, numero, agencia);
    }

    public ContaPoupanca(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo){
        super(titular, gerente, numero, agencia, saldo);
    }

    public ContaPoupanca(Pessoa titular, Gerente gerente, String numero, String agencia, Double saldo, Double juros){
        super(titular, gerente, numero, agencia, saldo);
        this.juros = juros;
    }
}
