package aula07.codigos.exemplos.recursividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Testando recursividade
        System.out.println(fatorial(input.nextInt()));
    }

    public static int fatorial(int n){
        if (n == 1) return n;
        else return n * fatorial(n-1);
    }
}
