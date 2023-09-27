package aula04.codigos.questao01;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando objetos da classe Pessoa
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Fulano", "Derbyson", "da Silva");
        Pessoa p3 = new Pessoa("Derpina", "Zirulina", "da Silva", "123.456.789-00", 20);

        // Dando apenas um nome para o objeto p1
        p1.setNome("Cicrano");

        // Utilizando os métodos sobrecarregados
        p1.imprimeNome(p1.getNome());
        p2.imprimeNome(p2.getNome(), p2.getSobrenome());
        p3.imprimeNome(p3.getNome(), p3.getNomeMeio(), p3.getSobrenome());
    }
}