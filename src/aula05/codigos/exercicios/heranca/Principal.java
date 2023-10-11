package aula05.codigos.exercicios.heranca;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("00001", new Date(), "123.456.789-000", "Fulano", 23, 1.77, 77.8);

        /*
         TODO
         - Ver como trabalhar com data em Java
        */
        System.out.println(f1.getDataAdmissao());
    }
}
