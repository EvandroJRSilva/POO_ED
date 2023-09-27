package aula04.codigos.questao01;

public class Pessoa {
    String nome, nomeMeio, sobrenome, cpf; // como são atributos do mesmo tipo, podem ser declarados na mesma linha
    int idade;

    // Construtores
    public Pessoa(){}

    public Pessoa(String nome, String nomeMeio, String sobrenome){
        this.nome = nome;
        this.nomeMeio = nomeMeio;
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String nomeMeio, String sobrenome, String cpf, int idade){
        this.nome = nome;
        this.nomeMeio = nomeMeio;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos Sobrecarregados
    public void imprimeNome(String nome){
        System.out.println(nome);
    }

    public void imprimeNome(String nome, String sobrenome){
        System.out.println(nome + " " + sobrenome);
    }

    public void imprimeNome(String nome, String nomeMeio, String sobrenome){
        System.out.println(nome + " " + nomeMeio + " " + sobrenome);
    }
}