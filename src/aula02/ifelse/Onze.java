package aula02.ifelse;

import java.util.Scanner;

public class Onze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o salário do colaborador");
        double salario = input.nextDouble();

        System.out.println(); // apenas para separar as informações da requisição
        System.out.println("Salário antes do reajuste: "+salario);

        double salarioAntigo = salario;

        if (salario <= 280){
            System.out.println("O percentual de aumento aplicado foi de 20%");
            salario = salario + (salario * 0.2);
            System.out.println("O valor do aumento: " + (salario - salarioAntigo));
            System.out.println("O novo salário: " + salario);
        } else if (salario > 280 && salario <= 700) {
            System.out.println("O percentual de aumento aplicado foi de 15%");
            salario = salario + (salario*0.15);
            System.out.println("O valor do aumento: " + (salario - salarioAntigo));
            System.out.println("O novo salário: " + salario);
        } else if (salario > 700 && salario <= 1500) {
            System.out.println("O percentual de aumento aplicado foi de 10%");
            salario = salario + (salario*0.1);
            System.out.println("O valor do aumento: " + (salario - salarioAntigo));
            System.out.println("O novo salário: " + salario);
        }else{
            System.out.println("O percentual de aumento aplicado foi de 5%");
            salario = salario + (salario*0.05);
            System.out.println("O valor do aumento: " + (salario - salarioAntigo));
            System.out.println("O novo salário: " + salario);
        }
    }
}