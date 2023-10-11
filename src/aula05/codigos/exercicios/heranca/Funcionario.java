package aula05.codigos.exercicios.heranca;

import java.util.Date;

public class Funcionario extends PessoaFisica{
    String matriculaFuncionario;
    Date dataAdmissao;

    public Funcionario(){}

    public Funcionario(String matriculaFuncionario, Date dataAdmissao, String cpf, String nome, int idade, double altura,
                       double peso) {
        super(cpf, nome, idade, altura, peso);
        this.matriculaFuncionario = matriculaFuncionario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}