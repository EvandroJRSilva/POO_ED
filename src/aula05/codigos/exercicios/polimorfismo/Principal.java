package aula05.codigos.exercicios.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Animal gabriel = new Animal(2, "homo", "sapiens", "Biel", 21);
        /*System.out.println("O animal " + gabriel.getNome() +
                " tem " + gabriel.getIdade() +
                " anos, e " + gabriel.getQuantidadePatas() +
                " patas, e é da espécie " + gabriel.getGenero() + " "
                + gabriel.getEspecie() + "\n");

        gabriel.mover();
        gabriel.comer();
        gabriel.dormir();*/

        //System.out.println();

        Cachorro roque = new Cachorro(4, "canino", "pintcher", "Hilks", 1, 8.3, 10);
        System.out.println("O cachorro " + roque.nome + " tem " +
                roque.idade + " anos, e " +
                roque.quantidadePatas + " patas, e é da espécie " +
                roque.genero + " " + roque.especie + ", late " +
                roque.frequenciaLatido + " vezes por minuto a uma altura de " +
                roque.alturaLatido + " decibeis.\n");

        roque.mover();
        roque.comer();
        roque.dormir();

        //roque.setAlturaLatido(30);
        //roque.setNome("Milk");
        //roque.setEspecie("pitbull");
        roque.alturaLatido = 30;
        roque.nome = "Milk";
        roque.especie = "pitbull";

        System.out.println("\nO cachorro " + roque.getNome() + " tem " +
                roque.getIdade() + " anos, e " +
                roque.getQuantidadePatas() + " patas, e é da espécie " +
                roque.getGenero() + " " + roque.getEspecie() + ", late " +
                roque.getFrequenciaLatido() + " vezes por minuto a uma altura de " +
                roque.getAlturaLatido() + " decibeis.\n");
    }
}