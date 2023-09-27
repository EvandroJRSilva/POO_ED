package aula05.codigos.exemplos.encapsulamento1;

import aula05.codigos.exemplos.encapsulamento3.PrivateEProtected;

public class SubPrivateEProtected extends PrivateEProtected {
    private final int exemplo5 = 10;

    public SubPrivateEProtected(int exemplo3, int exemplo4) {
        super(exemplo3, exemplo4);
    }

    public int getSuperExemplo4(){
        return super.getExemplo4();
    }
    public int getExemplo5() {
        return exemplo5;
    }
}