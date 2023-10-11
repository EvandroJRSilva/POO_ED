package prova1.simples;

public class Principal {
    public static void main(String[] args) {
        Nascimento n1 = new Nascimento("João", 10, 2, 2001, 12, 30);
        Nascimento n2 = new Nascimento("Maria", 10, 2, 2001, 12, 45);

        System.out.println(n1.getNome() + " é mais velho que " + n2.getNome() + " por " +
                (n2.getMinuto()-n1.getMinuto()) + " minutos.");
    }
}