package aula03.exercicio04;

import aula03.exercicio01.Caneta;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class CanetaTesteVetor {
    public static void main(String[] args) {
        // Criando um array com 50 elementos. No caso serão criados 50 referências para futuros objetos.
        Caneta[] canetaVetor = new Caneta[50];

        //variável para ajudar a controlar a quantidade de canetas cadastradas. Vai servir também como índice no
        // momento de cadastro de novas canetas. Os índices vão de 0 a 49.
        int quantidadeCaneta = 0;

        Scanner input = new Scanner(System.in);
        int opcao = -1;

        // Loop para o menu
        while(opcao != 0){
            // verificando qual opcao foi escolhida
            System.out.println("Bem vindo! Selecione uma das opcoes a seguir: \n"+
                    "1 - Para Cadastrar uma nova caneta;\n" +
                    "2 - Para exibir todas as canetas;\n"+
                    "3 - Exibir a quantidade de canetas;\n"+
                    "4 - Para consultar a quantidade de canetas de uma determinada cor;\n"+
                    "0 - Para sair\n\n");
            opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Até a próxima!");
                    break; // break é necessário para impedir que todos os 'cases' sejam executados.
                case 1:
                    if (quantidadeCaneta == 50) {
                        System.out.println("Não é mais possível cadastrar novas canetas!");
                    }else{
                        canetaVetor[quantidadeCaneta] = new Caneta(); // criando o objeto e já armazenando no vetor.

                        System.out.println("Para cadastrar uma caneta você deverá fornecer a marca, a cor e o tamanho");
                        System.out.println("Digite a marca: ");
                        // O método setMarca precisa de uma String. A String que vamos passar é a mesma que virá da
                        // leitura do console.
                        canetaVetor[quantidadeCaneta].setMarca(input.next());
                        System.out.println("Digite a cor: ");
                        canetaVetor[quantidadeCaneta].setCor(input.next());
                        System.out.println("Digite o tamanho: ");
                        canetaVetor[quantidadeCaneta].setTamanho(input.nextDouble());

                        quantidadeCaneta++; //garantindo a atualização da variável, um por vez
                    }
                    break;
                case 2:
                    for(int i=0; i < quantidadeCaneta;i++){ // garantindo que só serão mostradas canetas cadastradas
                        System.out.println("Caneta "+ (i+1)+":\n"+
                                "Marca: "+ canetaVetor[i].getMarca()+";\n"+
                                "Cor: "+canetaVetor[i].getCor()+";\n"+
                                "Tamanho: "+canetaVetor[i].getTamanho()+";\n\n");
                    }
                    break;
                case 3:
                    System.out.println("Foram cadastradas " + quantidadeCaneta + " caneta(s);\n\n");
                    break;
                case 4:
                    System.out.println("Digite a cor desejada: ");
                    String cor = input.next();
                    int quantidadeMesmaCor = 0;

                    for(int i=0;i < quantidadeCaneta; i++){
                        if(canetaVetor[i].getCor().equals(cor)){
                            quantidadeMesmaCor++;
                        }
                    }

                    System.out.println("Existem " + quantidadeMesmaCor + " canetas da cor " + cor +".\n\n");

                    break;
                default:
                    System.out.println("Opção Inválida!\n\n");
                    break;
            }
        }
    }
}