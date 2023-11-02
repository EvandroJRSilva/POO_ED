package aula07.codigos.exemplos.collections;

public class Professor {
    private String nome, matricula;

    public Professor(String nome, String matricula){
        this.nome = nome; this.matricula = matricula;
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
}
