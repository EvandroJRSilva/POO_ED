package prova2.pratica.funcionarios;



import prova2.pratica.Aluno;
import prova2.pratica.abstratas.Conta;
import prova2.pratica.abstratas.Funcionario;
import prova2.pratica.interfaces.Diretoria;
import prova2.pratica.interfaces.Secretaria;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Diretoria, Secretaria {
    @Override
    public void reuniao() {
        System.out.println("O(A) gerente(a) " + super.getNome() + " entrou em reunião");
    }

    @Override
    public void reuniaoGeral(ArrayList<Funcionario> funcionarios) {
        System.out.println("O(a) gerente(a) " + super.getNome() + " entrou em reunião com \n");
        for (Funcionario f: funcionarios) {
            System.out.println("\t - " + f.getNome() + ": " + f.getClass().toString() + ";\n");
        }
    }

    @Override
    public void atenderAluno(Aluno aluno) {
        System.out.println("O(A) gerente(a) " + super.getNome() + " está atendendo o aluno "+ aluno.getNome()+".");
        if(aluno.getContas() != null){
            System.out.println(aluno.getNome() + " tem as seguintes contas: ");
            for (Conta c: aluno.getContas()) {
                System.out.println("Agência: " + c.getAgencia() + ";\n");
                System.out.println("Número: "+ c.getNumero() + ";\n");
            }
        }
    }

    @Override
    public void atenderProfessor(Professor professor) {

    }
}
