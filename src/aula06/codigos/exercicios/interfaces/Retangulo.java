package aula06.codigos.exercicios.interfaces;

public class Retangulo implements Forma{
    private double altura, largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return altura*largura;
    }
}
