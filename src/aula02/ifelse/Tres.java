package aula02.ifelse;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o sexo");
        String sexo =  input.next();

        if(sexo.equals("F")){
            System.out.println("F - feminino");
        } else if (sexo.equals("M")) {
            System.out.println("M - masculino");
        }else {
            System.out.println("Sexo inválido");
        }
    }
}