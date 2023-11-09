package aula08.codigos.exemplos.vetor;

public class TestaVetorAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Fulano");
        Aluno a2 = new Aluno("Cicrano");

        VetorAlunos lista1 = new VetorAlunos();
        VetorAlunos lista2 = new VetorAlunos();

        lista1.adiciona(a1);
        lista1.adiciona(a1, 1);
        lista1.adiciona(a2, 2);

        System.out.println(lista1.buscar(0).getNome());
        System.out.println(lista1.buscar(1).getNome());
        System.out.println(lista1.buscar(2).getNome());

        System.out.println("Tamanho lista1: "+ lista1.tamanho());

        lista1.remover(a2);

        System.out.println("Tamanho: "+ lista1.tamanho());
        if(lista1.contem(a2)){
            System.out.println("O aluno "+ a2.getNome()+" está na lista");
        }else {
            System.out.println("O aluno "+ a2.getNome()+" não está na lista");
        }

        System.out.println("\n\n");

        lista2.adicionaFim(a1);
        lista2.adicionaFim(a2);
        lista2.adicionaFim(a1);

        System.out.println(lista2.buscar(0).getNome());
        System.out.println(lista2.buscar(1).getNome());
        System.out.println(lista2.buscar(2).getNome());
        System.out.println("Quantidade de alunos lista2: "+lista2.getQuantidadeAlunos());
        System.out.println("Tamanho: lista2 "+lista2.tamanho());
    }
}
