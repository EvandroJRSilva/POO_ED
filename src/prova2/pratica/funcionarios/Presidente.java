package prova2.pratica.funcionarios;



import prova2.pratica.abstratas.Funcionario;
import prova2.pratica.interfaces.Diretoria;

import java.util.ArrayList;

public class Presidente extends Funcionario implements Diretoria {
    @Override
    public void reuniao() {
        System.out.println("O(a) presidente " + super.getNome() + " entrou em reunião");
    }

    @Override
    public void reuniaoGeral(ArrayList<Funcionario> funcionarios) {
        System.out.println("O(a) presidente " + super.getNome() + " entrou em reunião com \n");
        for (Funcionario f: funcionarios) {
            System.out.println("\t - " + f.getNome() + ": " + f.getClass().toString() + ";\n");
        }
    }
}
