package prova2.pratica.app;

import prova2.pratica.Aluno;
import prova2.pratica.Curso;
import prova2.pratica.Disciplina;
import prova2.pratica.empresas.Faculdade;
import prova2.pratica.funcionarios.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Criando uma Faculdade =======================================================================================
        Faculdade f1 = new Faculdade("Faculdade de Teresina", "1.1252/242", "FaThe");
        // Adicionando os membros de uma faculdade ---------------------------------------------------------------------
        //      É importante lembrar que os objetos para Presidente, SecAcademica e SecFinanceira já foram
        //      instanciados dentro da classe Faculdade. Por isso não há necessidade de instanciar aqui.
        // "Configurando" o Presidente - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getPresidente().setNome("Reviscleiterson da Silva");
        f1.getPresidente().setCpf("123.456.789-00");
        f1.getPresidente().setDataNascimento(LocalDate.of(1980, 2, 25));
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // Podemos ter vários diretores
        //      Internamente apenas o ArraList havia sido criado, porém está vazio. Por isso estamos instanciando a
        //      classe Diretor para adicioná-los à Faculdade.
        f1.addDiretor(new Diretor()); f1.addDiretor(new Diretor());

        // Configurando o primeiro diretor - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getDiretores().get(0).setNome("Vanesleiderson Van Damme");
        f1.getDiretores().get(0).setCpf("234.567.890-11");
        f1.getDiretores().get(0).setDataNascimento(LocalDate.of(1983, 1, 5));
        f1.getDiretores().get(0).setDataAdmissao(LocalDateTime.of(2001, 2, 10, 10, 30));
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // Configurando o(a) Secretário(a) Acadêmico - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getSecAcademica().setNome("Heriscalvo Hairless da Silva");
        f1.getSecAcademica().setCpf("345.678.901-22");
        f1.getSecAcademica().setDataNascimento(LocalDate.of(1995, 7, 7));
        f1.getSecAcademica().setDataAdmissao(LocalDateTime.of(2001, 2, 10, 10, 40));
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // Configurando Secretaria Financeira - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getSecFinanceira().setNome("Joe Jorge sem RG");
        f1.getSecFinanceira().setCpf("456.789.012-33");
        f1.getSecFinanceira().setDataNascimento(LocalDate.of(1993, 10, 22));
        f1.getSecFinanceira().setDataAdmissao(LocalDateTime.of(2001, 2, 10, 11, 0));
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        //--------------------------------------------------------------------------------------------------------------

        // Adicionando dois cursos -------------------------------------------------------------------------------------
        f1.addCurso(new Curso()); f1.addCurso(new Curso());

        // Configurando o primeiro Curso - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getCursos().get(0).setNome("Análise e Desenvolvimento de Sistemas");
        f1.getCursos().get(0).setCoordenador(new Coordenador("Ilvilano Pinacoteca Disco"));

        // Adicionando duas disciplinas ao primeiro curso - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        f1.getCursos().get(0).addDisciplina(new Disciplina()); f1.getCursos().get(0).addDisciplina(new Disciplina());

        // Configurando a primeira disciplina -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
        f1.getCursos().get(0).getDisciplinas().get(0).setNome("Programação Orientada a Objetos e Estrutura de Dados");
        f1.getCursos().get(0).getDisciplinas().get(0).setMatricula("123456");

        // Criando um professor
        //      instanciando "em separado", pois a partir dos diagramas sabemos que deve ser uma instância
        //      independente. Ou seja, devemos ter algum tipo de referência direta a essa objeto.
        Professor professor1 = new Professor();
        professor1.setNome("Marcorelvis Nogueira Teixeira Madureira");
        professor1.setCpf("456.789.012-33");
        professor1.setCarteiraTrabalho("5436234");
        professor1.setDataNascimento(LocalDate.of(1991, 9, 7));
        professor1.setDataAdmissao(LocalDateTime.of(2020, 6, 1, 7, 30));

        // Criando três alunos
        //      Mesmo caso do Professor
        Aluno aluno1  = new Aluno();
        aluno1.setNome("Neymar Cristiano Ronaldson do Messi Ribeiro");
        aluno1.setMatricula("323523");
        aluno1.setDataNascimento(LocalDate.of(2005, 10, 10));

        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
    }
}
