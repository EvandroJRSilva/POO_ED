package prova2.pratica;

import aula07.codigos.exemplos.collections.Professor;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String matricula;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();

    public Disciplina(){}

    public Disciplina(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void removeProfessor(Professor professor){
        this.professores.remove(professor);
    }
}
