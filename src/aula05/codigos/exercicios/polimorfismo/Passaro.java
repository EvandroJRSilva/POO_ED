package aula05.codigos.exercicios.polimorfismo;

public class Passaro extends Animal{
    String corPena;
    String formatoBico;

    public Passaro(int quantidadePatas, String genero, String especie, String nome, int idade, String corPena,
                   String formatoBico){
        super(quantidadePatas, genero, especie, nome, idade);
        this.corPena = corPena;
        this.formatoBico = formatoBico;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getFormatoBico() {
        return formatoBico;
    }

    public void setFormatoBico(String formatoBico) {
        this.formatoBico = formatoBico;
    }

    public void mover(){
        System.out.println("Voa passarinho, voa!");
    }

    public void comer(){
        System.out.println("Que alpiste gostoso!");
    }
}