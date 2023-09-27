package aula02.ifelse;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número:");
        int num1 = input.nextInt();
        // Comentário de 1 linha

        /*Comentário de
        * mais de 1 linha*/

        System.out.println("Escreva o segundo número:");
        int num2 = input.nextInt();

        System.out.println("Escreva o terceiro número:");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("O maior número é: "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: "+num2);
        }else{
            System.out.println("O maior número é: "+num3);
        }
    }
}