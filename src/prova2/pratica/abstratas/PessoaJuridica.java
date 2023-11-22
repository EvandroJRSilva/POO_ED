package prova2.pratica.abstratas;

import java.util.ArrayList;

public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;
    private ArrayList<Funcionario> funcionarios;

    public PessoaJuridica(){}

    public PessoaJuridica(String nome){
        super(nome);
    }

    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cnpj, String nomeFantasia){
        super(nome);
        this.cnpj = cnpj; this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
}
