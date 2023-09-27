package aula05.codigos.exemplos.encapsulamento1;

import aula05.codigos.exemplos.encapsulamento2.DefaultEPublic;
import aula05.codigos.exemplos.encapsulamento3.PrivateEProtected;

public class Principal {
    public static void main(String[] args) {
        DefaultEPublic dEf = new DefaultEPublic(10, 20);

        System.out.println("Exemplo 2: " + dEf.exemplo2);
        System.out.println("Exemplo 2: " + dEf.getExemplo2());



        PrivateEProtected pEp = new PrivateEProtected(10, 20);
        System.out.println("Exemplo 3: " + pEp.getExemplo3());

        System.out.println(); // linha em branco

        SubPrivateEProtected sPeP = new SubPrivateEProtected(20, 30);
        System.out.println("Exemplo 3: " + sPeP.getExemplo3());
        System.out.println("Exemplo 4: " + sPeP.getSuperExemplo4());
        System.out.println("Exemplo 5: " + sPeP.getExemplo5());
    }
}