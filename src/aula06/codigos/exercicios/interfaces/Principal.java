package aula06.codigos.exercicios.interfaces;

public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        retangulo.setAltura(10);
        retangulo.setLargura(30);

        triangulo.setLado1(2);
        triangulo.setLado2(3);
        triangulo.setLado3(3);

        System.out.println("A área do retângulo é: " + retangulo.getArea());
        System.out.println("A área do triângulo é: " + triangulo.getArea());
    }
}
