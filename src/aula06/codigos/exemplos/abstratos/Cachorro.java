package aula06.codigos.exemplos.abstratos;

public class Cachorro extends Animal{
    double alturaLatido;
    double frequenciaLatido;

    public Cachorro(int quantidadePata, String genero, String especie, String nome, int idade, double alturaLatido,
                    double frequenciaLatido){
        super(quantidadePata, genero, especie, nome, idade);
        this.alturaLatido = alturaLatido;
        this.frequenciaLatido = frequenciaLatido;
    }

    public double getAlturaLatido() {
        return alturaLatido;
    }

    public void setAlturaLatido(double alturaLatido) {
        this.alturaLatido = alturaLatido;
    }

    public double getFrequenciaLatido() {
        return frequenciaLatido;
    }

    public void setFrequenciaLatido(double frequenciaLatido) {
        this.frequenciaLatido = frequenciaLatido;
    }

    @Override
    void mover() {
        System.out.println(getNome() + " corre feliz e satisfeito!");
    }
}
