package aula05.codigos.exercicios.heranca;

public class PessoaFisica extends Pessoa{
    String cpf;

    public PessoaFisica(){}

    public PessoaFisica(String cpf, String nome, int idade, double altura, double peso){
        super(nome, idade, altura, peso);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}