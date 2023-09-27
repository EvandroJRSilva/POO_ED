package aula05.codigos.exercicios.polimorfismo;

public class Animal {
    int quantidadePatas;
    String genero;
    String especie;
    String nome;
    int idade;

    public Animal(int quantidadePatas, String genero, String especie, String nome, int idade){
        this.quantidadePatas = quantidadePatas;
        this.genero = genero;
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mover(){
        System.out.println("O animal está se movendo");
    }

    public void comer(){
        System.out.println("O animal está comendo");
    }

    public final void dormir(){
        System.out.println("O animal está dormindo");
    }
}