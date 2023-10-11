package prova1.simples;

public class Nascimento {
    private String nome;
    private int dia, mes, ano, hora, minuto;

    public Nascimento(String nome, int dia, int mes, int ano, int hora, int minuto){
        this.nome = nome; this.dia = dia; this.mes = mes; this.ano = ano;
        this.hora = hora; this.minuto = minuto;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
