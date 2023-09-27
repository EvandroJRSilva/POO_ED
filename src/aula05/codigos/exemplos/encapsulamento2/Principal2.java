package aula05.codigos.exemplos.encapsulamento2;

public class Principal2 {
    public static void main(String[] args) {
        DefaultEPublic dEf = new DefaultEPublic(10, 20);

        System.out.println("Exemplo 1: " + dEf.exemplo1);
        System.out.println("Exemplo 1: " + dEf.getExemplo1());
        System.out.println(); // apenas para acrescentar uma linha em branco
        System.out.println("Exemplo 2: " + dEf.exemplo2);
        System.out.println("Exemplo 2: " + dEf.getExemplo2());
    }
}