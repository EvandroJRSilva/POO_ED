package prova1.melhorado;

public class Nascimento {
    private String nome;
    private int dia, mes, ano, hora, minuto;

    public Nascimento(String nome, int dia, int mes, int ano, int hora, int minuto){
        this.nome = nome; this.dia = dia; this.mes = mes; this.ano = ano;
        this.hora = hora; this.minuto = minuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void calculaDiferencaIdade(int ano1, int ano2, int mes1, int mes2, int dia1, int dia2, int hora1, int hora2,
                                      int minuto1, int minuto2, String nome1, String nome2){
        String mensagem = "";

        // Minutos por tempo
        int minutosPorHora = 60;
        int minutosPorDia = 24 * minutosPorHora;
        int minutosPorMes = 30 * minutosPorDia;
        int minutosPorAno = 12 * minutosPorMes;

        // Transformando tudo em minutos
        int nascimentoMinutos1 =
                minuto1 + (hora1 * minutosPorHora) + (dia1 * minutosPorDia) + (mes1 * minutosPorMes) + (ano1 * minutosPorAno);
        int nascimentoMinutos2 =
                minuto2 + (hora2 * minutosPorHora) + (dia2 * minutosPorDia) + (mes2 * minutosPorMes) + (ano2 * minutosPorAno);

        int diferencaIdade = nascimentoMinutos1 - nascimentoMinutos2;

        if (diferencaIdade > 0){
            mensagem += nome2 + " é mais velho que " + nome1 + " por " + diferencaIdade + " minutos.";
        } else if (diferencaIdade < 0) {
            mensagem += nome1 + " é mais velho que " + nome2 + " por " + Math.abs(diferencaIdade) + " minutos.";
        } else {
            mensagem += nome1 + " e " + nome2 + " possuem a mesma idade.";
        }

        System.out.println(mensagem);
    }
}
