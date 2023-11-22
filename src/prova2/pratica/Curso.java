package prova2.pratica;

import prova2.pratica.funcionarios.Coordenador;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private Coordenador coordenador;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(){}

    public Curso(String nome){
        this.nome = nome;
    }

    public Curso(String nome, Coordenador coordenador){
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public Curso(String nome, Coordenador coordenador, ArrayList<Disciplina> disciplinas){
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}
