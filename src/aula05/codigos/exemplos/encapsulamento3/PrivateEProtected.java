package aula05.codigos.exemplos.encapsulamento3;

public class PrivateEProtected {
    private int exemplo3;
    protected int exemplo4;

    public PrivateEProtected(int exemplo3, int exemplo4){
        this.exemplo3 = exemplo3;
        this.exemplo4 = exemplo4;
    }

    public int getExemplo3() {
        return exemplo3;
    }

    protected int getExemplo4(){
        return exemplo4;
    }
}