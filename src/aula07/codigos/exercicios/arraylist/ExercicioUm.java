package aula07.codigos.exercicios.arraylist;

import java.util.ArrayList;

public class ExercicioUm {
    public static void main(String[] args) {
        /* Escreva um programa Java para criar um ArrayList, adicione algumas cores String e imprima a coleção*/
        ArrayList<String> cores = new ArrayList<>();

        cores.add("Purple");
        cores.add("Pink");
        cores.add("Black");
        cores.add("White");

        for (String cor: cores) {
            System.out.println(cor);
        }
    }
}
