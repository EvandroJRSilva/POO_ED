package aula07.codigos.exemplos.exceptions;

import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // sem try-catch
        //System.out.println((num1/num2)); // vai dar erro se num2 == 0

        try{
            System.out.println((num1/num2));
            System.out.println("Depois da divisão, dentro do try");
        }catch (ArithmeticException ae){
            System.out.println(ae);
            ae.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Dentro do Finally");
        }

        System.out.println("Fora do try-catch");
    }
}
