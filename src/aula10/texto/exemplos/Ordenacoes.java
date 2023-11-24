package aula10.texto.exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacoes {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i=0; i < vetor.length; i++){
            System.out.println("Escreva o valor para a posição " + i + " :");
            vetor[i] = input.nextInt();
        }

        System.out.println("Vetor desordenado: " + Arrays.toString(vetor));
        //vetor = selectionSort(vetor);
        //vetor = bubbleSort(vetor);
        //quickSort(vetor, 0, 10);
        mergeSort(vetor, 0, 9);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }

    public static int[] selectionSort(int[] vetor){
        for(int i = 0; i < vetor.length - 1; i++){
            int min = i;
            for (int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            if (i != min){
                int aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
            }
        }
        return vetor;
    }

    public static  int[] insertionSort(int[] vetor){
        for(int i = 1; i < vetor.length; i++){
            int aux = vetor[i];
            int j = i;

            while (j > 0 && vetor[j-1] > aux){
                vetor[j] = vetor[j-1];
                j -= 1;
            }
            vetor[j] = aux;
        }
        return vetor;
    }

    public static  int[] bubbleSort(int[] vetor){
        /*
        // Não otimizado
        boolean trocou = true;
        while(trocou){
            trocou = false;
            for (int i=1; i < vetor.length; i++){
                if (vetor[i-1] > vetor[i]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = aux;
                    trocou = true;
                }
            }
        }*/


        // Otimizado
        int n = vetor.length;
        while(n >= 1){
            int novoN = 0;
            for (int i=1; i < n; i++){
                if (vetor[i - 1] > vetor[i]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = aux;
                    novoN = i;
                }
            }
            n = novoN;
        }
        return  vetor;
    }

    public static void quickSort(int[] vetor, int inicio, int fim){
        int i, j, pivo, aux;
        i = inicio;
        j = fim-1;
        pivo = vetor[(inicio+fim)/2];

        while(i<=j){
            while(vetor[i] < pivo && i < fim){
                i++;
            }
            while(vetor[j] > pivo && j > inicio){
                j--;
            }

            if(i <= j){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }
        if(j > inicio){
            quickSort(vetor, inicio, j+1);
        }
        if(i < fim){
            quickSort(vetor, i, fim);
        }
    }

    public static void mergeSort(int[] vetor, int inicio, int fim){
        // validando os parâmetros
        if(vetor != null && inicio < fim && inicio >= 0 && fim < vetor.length){
            int meio = (inicio + fim)/2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim){
        int[] aux = new int[vetor.length];
        // Copiando o trecho que será ordenado
        for(int i=inicio; i <= fim; i++){
            aux[i] = vetor[i];
        }

        // flags
        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        // junção dos vetores ordenados
        while(i <= meio && j <= fim){
            if(aux[i] < aux[j]){
                vetor[k] = aux[i];
                i++;
            }else{
                vetor[k] = aux[j];
                j++;
            }
            k++;
        }

        // Acrescentando/Anexando itens que não foram usados na junção
        while(i <= meio){
            vetor[k] = aux[i];
            i++;
            k++;
        }

        // Acrescentando/Anexando itens que não foram usados na junção
        while(j <= fim){
            vetor[k] = aux[j];
            j++;
            k++;
        }
    }
}
