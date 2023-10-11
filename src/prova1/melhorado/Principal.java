package prova1.melhorado;

public class Principal {
    public static void main(String[] args) {
        Nascimento n1 = new Nascimento("João", 10, 2, 2001, 12, 30);
        Nascimento n2 = new Nascimento("Maria", 10, 2, 2001, 12, 45);

        n1.calculaDiferencaIdade(n1.getAno(), n2.getAno(), n1.getMes(), n2.getMes(), n1.getDia(), n2.getDia(),
                n1.getHora(), n2.getHora(), n1.getMinuto(), n2.getMinuto(), n1.getNome(), n2.getNome());
    }
}