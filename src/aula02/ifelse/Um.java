package aula02.ifelse;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = input.nextInt();

        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("O maior número é "+ num1);
        }else{
            System.out.println("O maior número é "+ num2);
        }
    }
}