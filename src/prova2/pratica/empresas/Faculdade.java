package prova2.pratica.empresas;



import prova2.pratica.Curso;
import prova2.pratica.abstratas.PessoaJuridica;
import prova2.pratica.funcionarios.Diretor;
import prova2.pratica.funcionarios.Presidente;
import prova2.pratica.funcionarios.SecAcademica;
import prova2.pratica.funcionarios.SecFinanceira;

import java.util.ArrayList;

public class Faculdade extends PessoaJuridica {
    // Instanciando logo como um exemplo para uso de composição
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Presidente presidente = new Presidente();
    private ArrayList<Diretor> diretores = new ArrayList<>();
    private SecAcademica secAcademica =  new SecAcademica();
    private SecFinanceira secFinanceira = new SecFinanceira();

    public Faculdade(){}

    public Faculdade(String nome){
        super(nome);
    }

    public Faculdade(String nome, String cnpj){
        super(nome, cnpj);
    }

    public Faculdade(String nome, String cnpj, String nomeFantasia){
        super(nome, cnpj, nomeFantasia);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente)
    {
        this.presidente = presidente;
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<Diretor> diretores) {
        this.diretores = diretores;
    }

    public SecAcademica getSecAcademica() {
        return secAcademica;
    }

    public void setSecAcademica(SecAcademica secAcademica) {
        this.secAcademica = secAcademica;
    }

    public SecFinanceira getSecFinanceira() {
        return secFinanceira;
    }

    public void setSecFinanceira(SecFinanceira secFinanceira) {
        this.secFinanceira = secFinanceira;
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void removeCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public void addDiretor(Diretor diretor){
        this.diretores.add(diretor);
    }

    public void removeDiretor(Diretor diretor){
        this.diretores.remove(diretor);
    }
}
