package aula05.codigos.exemplos.encapsulamento2;

public class DefaultEPublic {
    int exemplo1;
    public int exemplo2;

    public DefaultEPublic(int exemplo1, int exemplo2){
        this.exemplo1 = exemplo1;
        this.exemplo2 = exemplo2;
    }
    int getExemplo1(){
        return exemplo1;
    }

    public int getExemplo2(){
        return exemplo2;
    }
}