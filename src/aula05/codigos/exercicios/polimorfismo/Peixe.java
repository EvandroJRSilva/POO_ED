package aula05.codigos.exercicios.polimorfismo;

public class Peixe extends Animal{
    double brilhoEscama;
    int quantidadeBarbatana;
    double comprimento;
    boolean tipoAgua; // true para água doce e false para água salgada

    public Peixe(int quantidaPatas, String genero, String nome, String especie, int idade, double brilhoEscama,
                 int quantidadeBarbatana, double comprimento, boolean tipoAgua){
        super(quantidaPatas, genero, especie, nome, idade);
        this.brilhoEscama = brilhoEscama;
        this.quantidadeBarbatana = quantidadeBarbatana;
        this.comprimento = comprimento;
        this.tipoAgua = tipoAgua;
    }

    public double getBrilhoEscama() {
        return brilhoEscama;
    }

    public void setBrilhoEscama(double brilhoEscama) {
        this.brilhoEscama = brilhoEscama;
    }

    public int getQuantidadeBarbatana() {
        return quantidadeBarbatana;
    }

    public void setQuantidadeBarbatana(int quantidadeBarbatana) {
        this.quantidadeBarbatana = quantidadeBarbatana;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(boolean tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void mover(){
        System.out.println("O peixe está nadando!");
    }

    public void comer(){
        System.out.println("O peixe está comendo toda a ração de peixe que eu joguei no aquário");
    }
}