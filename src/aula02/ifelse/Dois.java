package aula02.ifelse;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        int valor;
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número inteiro qualquer: ");
        valor = input.nextInt();

        if (valor >= 0){
            System.out.println("O valor é positivo");
        }else {
            System.out.println("O valor é negativo");
        }
    }
}