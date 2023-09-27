package aula02.repete;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        double num = -1;
        double soma = 0;
        Scanner input = new Scanner(System.in);
        while (num < 0) {
            System.out.println("Digite um número positivo: ");
            num = input.nextDouble();
        }

        for (double i = 1; i <= num; i++){
            System.out.println("Parcial: " + soma + " + 1/" + i);
            soma += 1/i;
        }

        //int i = 1;
        //while(i < num){
        //    soma += 1/i;
        //    i++;
        //}

        System.out.println("O resultado da soma é: "+ soma);
    }
}