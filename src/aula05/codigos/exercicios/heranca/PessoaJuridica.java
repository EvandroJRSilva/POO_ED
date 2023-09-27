package aula05.codigos.exercicios.heranca;

public class PessoaJuridica extends Pessoa{
    String cnpj;

    public PessoaJuridica(){}

    public PessoaJuridica(String cnpj, String nome, int idade, double altura, double peso){
        super(nome, idade, altura, peso);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}