package prova2.pratica.abstratas;

public abstract class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(){}

    public PessoaFisica(String nome){
        super(nome);
    }

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
