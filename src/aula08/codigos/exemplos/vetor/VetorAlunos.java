package aula08.codigos.exemplos.vetor;

public class VetorAlunos {
    private Aluno[] alunos = new Aluno[100];
    private int quantidadeAlunos;

    //==================================================================================================================
    // No nosso caso não é necessário termos esse par get-set. Está aqui apenas para você ver como é um get e um set
    // quando se lida com um vetor.
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    //==================================================================================================================

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void adiciona(Aluno aluno){
        for(int i=0; i < this.alunos.length; i++){
            if(this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void adiciona(Aluno aluno, int indice){
        if (this.alunos[indice] == null){
            this.alunos[indice] = aluno;
        }
        // DESAFIO: implementar adição em uma dada posição, mesmo que já exista algum Aluno lá. Obs.: sem excluir o
        // aluno que já existe.
    }

    // Implementação preferível no lugar do método adiciona(aluno)
    public void adicionaFim(Aluno aluno){
        if (this.quantidadeAlunos < this.alunos.length){
            this.alunos[quantidadeAlunos] = aluno;
            this.quantidadeAlunos++;
        }
    }

    public Aluno buscar(int indice){
        return this.alunos[indice];
        // E se não houver aluno nessa posição? Ou seja, o método vai retornar null.
        // Desafio: reimplementar esse método de forma a garantir o retorno de um objeto válido, senão o método
        // deve lançar uma exceção.
    }

    public void remover(Aluno aluno){
        for(int i=0;i<this.alunos.length;i++){
            if (this.alunos[i].equals(aluno))
            {
                this.alunos[i] = null;
                break;
            }
        }
        // Desafio: reorganizar o array se o aluno removido não for o último.
    }

    public boolean contem(Aluno aluno){
        for(int i=0;i<this.alunos.length;i++)
        {
            if(this.alunos[i] != null){
                if(this.alunos[i].equals(aluno)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int tamanho(){
        // FORMA 1
        int ultimo = 0;
        for(int i=0;i < this.alunos.length; i++){
            if(this.alunos[i] != null){
                ultimo++;
            }else{
                break;
            }
        }
        return ultimo;

        // FORMA 2
        //return this.quantidadeAlunos;
    }
}
