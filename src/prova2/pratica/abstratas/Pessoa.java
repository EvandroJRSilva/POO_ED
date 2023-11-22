package prova2.pratica.abstratas;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void removeConta(Conta conta){
        this.contas.remove(conta);
    }
}
