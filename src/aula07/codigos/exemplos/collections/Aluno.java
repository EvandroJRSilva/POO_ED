package aula07.codigos.exemplos.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno {
    private String nome, matricula;
    private HashMap<String, ArrayList<Double>> notas;

    public Aluno(String nome, String matricula){
        this.nome = nome; this.matricula = matricula;
        notas = new HashMap<>();
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

    public HashMap<String, ArrayList<Double>> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, ArrayList<Double>> notas) {
        this.notas = notas;
    }

    public void addNotasPorDisciplina(String nomeDisciplina, ArrayList<Double> notas){
        this.notas.put(nomeDisciplina, notas);
    }
}
