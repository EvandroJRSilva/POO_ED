package prova2.pratica.empresas;


import prova2.pratica.abstratas.PessoaJuridica;
import prova2.pratica.funcionarios.Diretor;
import prova2.pratica.funcionarios.Presidente;

import java.util.ArrayList;

public class Banco extends PessoaJuridica {
    private Presidente presidente = new Presidente();
    private ArrayList<Diretor> diretores = new ArrayList<>();

    public Banco(){}

    public Banco(String nome){
        super(nome);
    }

    public Banco(String nome, String cnpj){
        super(nome, cnpj);
    }

    public Banco(String nome, String cnpj, String nomeFantasia){
        super(nome, cnpj, nomeFantasia);
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<Diretor> diretores) {
        this.diretores = diretores;
    }

    public void addDiretor(Diretor diretor){
        this.diretores.add(diretor);
    }

    public void removeDiretor(Diretor diretor){
        this.diretores.remove(diretor);
    }
}
