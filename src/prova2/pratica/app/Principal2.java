package prova2.pratica.app;

import prova2.pratica.empresas.Faculdade;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao1 = 0;


        while(opcao1 != 5){
            System.out.println("BEM VINDO AO SISTEMA");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Para criar uma Faculdade\n" + "2 - Para criar um Banco\n" + "3 - Para criar um " +
                    "Aluno\n" + "4 - Para criar um Professor\n" + "5 - Para sair");
            opcao1 = input.nextInt();
            switch (opcao1){
                case 0:
                    String cnpj, nome, nomeFantasia;
                    int opcao2 = 0;
                    System.out.println("\n\n");
                    System.out.println("Digite o nome da Faculdade");
                    nome = input.nextLine();
                    System.out.println("Agora digite o nome pelo qual a faculdade ficará conhecida: ");
                    nomeFantasia = input.nextLine();
                    System.out.println("Por fim, digite o CNPJ: ");
                    cnpj = input.nextLine();
                    Faculdade f1 = new Faculdade(nome, cnpj, nomeFantasia);
                    System.out.println("A faculdade " + f1.getNome() + " foi criado com sucesso!");
                    while (opcao2 != 5){
                        System.out.println("\n O que você deseja fazer a seguir: ");
                        System.out.println("1 - Preencher os dados do Presidente da faculdade\n" + "2 - Adicionar " +
                                "Diretores à faculdade\n" + "3 - Preencher os dados do(a) Secretário(a) Financeiro\n" +
                                "4 - Preencher os dados do(a) Secretário Acadêmico\n" + "5 - Voltar para o menu " +
                                "anterior");
                        opcao2 = input.nextInt();
                        switch (opcao2){
                            case 1:
                                String cpf;
                                int ano, mes, dia;
                                System.out.println("\n\nEscreva o nome do Presidente: ");
                                nome = input.nextLine();
                                System.out.println("Digite o CPF do Presidente: ");
                                cpf = input.nextLine();
                                System.out.println("Digite o ano de nascimento: ");
                                ano = input.nextInt();
                                System.out.println("Digite o mês de nascimento: ");
                                mes = input.nextInt();
                                System.out.println("Digite o dia de nascimento: ");
                                dia = input.nextInt();
                                f1.getPresidente().setNome(nome);
                                f1.getPresidente().setCpf(cpf);
                                f1.getPresidente().setDataNascimento(LocalDate.of(ano, mes, dia));
                                break;
                            case 2:
                                System.out.println("Em construção");
                                break;
                            case 3:
                                System.out.println("Em construção");
                                break;
                            case 4:
                                System.out.println("Em construção");
                                break;
                            case 5:
                                System.out.println("Voltando ao menu anterior");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA!");
                                break;
                        }
                    }
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Agradecemos pelo seu tempo conosco!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
    }
}
