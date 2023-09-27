package aula05.codigos.exercicios.heranca;

public class Funcionario extends PessoaFisica{
    String matriculaFuncionario;

    public Funcionario(){}

    public Funcionario(String matriculaFuncionario, String cpf, String nome, int idade, double altura, double peso) {
        super(cpf, nome, idade, altura, peso);
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }
}