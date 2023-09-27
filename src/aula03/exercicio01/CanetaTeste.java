package aula03.exercicio01;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta bic = new Caneta();
        Caneta canetaAzul = new Caneta("Pilot", "Vermelho", 12.14);

        /*
        System.out.println("Caneta Bic\n" +
                "Marca: " + bic.getMarca() + "\n"+
                "Cor: " + bic.getCor() + "\n" +
                "Tamanho: " + bic.getTamanho() + "\n");

        bic.setMarca("Bic");
        bic.setCor("Azul");
        bic.setTamanho(13.5);

        System.out.println("Caneta Bic\n" +
                "Marca: " + bic.getMarca() + "\n"+
                "Cor: " + bic.getCor() + "\n" +
                "Tamanho: " + bic.getTamanho() + "\n");
        */

        System.out.println("Caneta Azul\n" +
                "Marca: " + canetaAzul.getMarca() + "\n"+
                "Cor: " + canetaAzul.getCor() + "\n" +
                "Tamanho: " + canetaAzul.getTamanho() + "\n");

        canetaAzul.setMarca("FaberCastell");
        canetaAzul.setCor("Preto");
        canetaAzul.setTamanho(11.5);

        System.out.println("Caneta Azul\n" +
                "Marca: " + canetaAzul.getMarca() + "\n"+
                "Cor: " + canetaAzul.getCor() + "\n" +
                "Tamanho: " + canetaAzul.getTamanho() + "\n");
    }
}