package aula02.repete;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = input.nextDouble();

        System.out.printf("SOMA \t\t SUBTRAÇÃO \t\t MULTIPLICAÇÃO \t\t DIVISÃO\n");
        for(int i = 0; i<11; i++) {
            if (i == 0) {
                System.out.println(num + " + " + i + " = "+(num+i)+"\t\t"+
                        num + " - " + i + " = " + (num - i)+"\t\t"+
                        num + " * " + i + " = " + (num * i)+"\t\t"+
                        num + " / " + i + " = --");
            } else {
                System.out.println(num + " + " + i + " = "+(num+i)+"\t\t"+
                        num + " - " + i + " = " + (num - i)+"\t\t"+
                        num + " * " + i + " = " + (num * i)+"\t\t"+
                        num + " / " + i + " = " + (num / i));

                System.out.printf("\n%.2f", num/i);
            }
        }
    }
}