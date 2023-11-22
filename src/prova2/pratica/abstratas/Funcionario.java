package prova2.pratica.abstratas;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Funcionario extends PessoaFisica {
    private String matricula;
    private LocalDateTime dataAdmissao;
    private String carteiraTrabalho;

    public Funcionario(){}

    public Funcionario(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
}
