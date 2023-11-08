package aula07.codigos.exemplos.collections;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando três professores
        Professor prof1 = new Professor("Fulano", "0123456789");
        Professor prof2 = new Professor("Cicrano", "1234567890");
        Professor prof3 = new Professor("Beltrano", "2345678901");

        // Criando três alunos
        Aluno aluno1 = new Aluno("Alano", "0987654321");
        Aluno aluno2 = new Aluno("Delano", "9876543210");
        Aluno aluno3 = new Aluno("Elmano", "8765432109");

        // Criando três disciplinas
        Disciplina disciplina1 = new Disciplina("POO");
        Disciplina disciplina2 = new Disciplina("ED");
        Disciplina disciplina3 = new Disciplina("Programação");

        // Adicionando um professor para cada disciplina
        disciplina1.setProfessor(prof1);
        disciplina2.setProfessor(prof2);
        disciplina3.setProfessor(prof3);

        // Adicionando os alunos em cada disciplina
        disciplina1.addAluno(aluno1); disciplina1.addAluno(aluno2);
        disciplina2.addAluno(aluno2); disciplina2.addAluno(aluno3);
        disciplina3.addAluno(aluno1); disciplina3.addAluno(aluno3);


        ArrayList<Double> notasAluno1 = new ArrayList<>(); // criando arraylist para armazenar notas
        ArrayList<Double> notasAluno2 = new ArrayList<>(); // criando arraylist para armazenar notas
        ArrayList<Double> notasAluno3 = new ArrayList<>(); // criando arraylist para armazenar notas

        // Adicionando as notas dos alunos por disciplina
        notasAluno1.add(7.5); notasAluno1.add(7.0); notasAluno1.add(8.7);
        notasAluno2.add(8.8); notasAluno2.add(7.7); notasAluno2.add(9.9);
        notasAluno3.add(5.0); notasAluno3.add(10.0); notasAluno3.add(7.5);

        aluno1.addNotasPorDisciplina(disciplina1.getNome(), notasAluno1);
        aluno1.addNotasPorDisciplina(disciplina3.getNome(), notasAluno1);

        aluno2.addNotasPorDisciplina(disciplina1.getNome(), notasAluno2);
        aluno2.addNotasPorDisciplina(disciplina2.getNome(), notasAluno2);

        aluno3.addNotasPorDisciplina(disciplina2.getNome(), notasAluno3);
        aluno3.addNotasPorDisciplina(disciplina3.getNome(), notasAluno3);

        // Imprimindo tudo
        System.out.println("O aluno " + aluno1.getNome() + " de matrícula " + aluno1.getMatricula() + " teve as " +
                "seguintes notas:\n" + aluno1.getNotas());

        System.out.println("O aluno " + aluno2.getNome() + " de matrícula " + aluno2.getMatricula() + " teve as " +
                "seguintes notas:\n" + aluno2.getNotas());

        System.out.println("O aluno " + aluno3.getNome() + " de matrícula " + aluno3.getMatricula() + " teve as " +
                "seguintes notas:\n" + aluno3.getNotas());

        System.out.println("A disciplina " + disciplina1.getNome() + " é ministrada pelo professor " + disciplina1.getProfessor().getNome());
        System.out.println("A disciplina " + disciplina2.getNome() + " é ministrada pelo professor " + disciplina2.getProfessor().getNome());
        System.out.println("A disciplina " + disciplina3.getNome() + " é ministrada pelo professor " + disciplina3.getProfessor().getNome());
    }
}
