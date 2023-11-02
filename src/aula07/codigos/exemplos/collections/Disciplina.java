package aula07.codigos.exemplos.collections;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome){
        this.nome = nome;
        alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
}
