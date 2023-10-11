package prova1.maisaprofundado;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Principal {
    public static void main(String[] args) {
        Nascimento n1 = new Nascimento("João", 10, 2, 2001, 12, 30);
        Nascimento n2 = new Nascimento("Maria", 10, 2, 2001, 12, 45);

        LocalDateTime t1 = LocalDateTime.of(n1.getAno(), n1.getMes(), n1.getDia(), n1.getHora(), n1.getMinuto());
        LocalDateTime t2 = LocalDateTime.of(n2.getAno(), n2.getMes(), n2.getDia(), n2.getHora(), n2.getMinuto());

        Period periodo = Period.between(t1.toLocalDate(), t2.toLocalDate()); // para anos, meses e dias
        Duration duracao = Duration.between(t1, t2); // para segundos

        // lógicas do if-else aqui
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());
        System.out.println(duracao.getSeconds());
    }
}
