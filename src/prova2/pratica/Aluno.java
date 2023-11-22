package prova2.pratica;



import prova2.pratica.abstratas.PessoaFisica;

import java.util.ArrayList;

public class Aluno extends PessoaFisica {
    private String matricula;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(){}

    public Aluno(String nome){
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    // TODO
    //  - Criar métodos para que um aluno se matricule ou cancele sua matrícula.
}
