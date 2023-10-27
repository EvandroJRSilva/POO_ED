package aula06.codigos.exercicios.abstratos;

public class Principal {
    public static void main(String[] args) {
    ContaPoupanca contaPoupanca = new ContaPoupanca(10000, "1234", "4321", "1", "4321", 0.02);
    ContaCorrente contaCorrente = new ContaCorrente(50000, "1234", "4322", "4", "634", 50, 1000);

    contaPoupanca.depositar(500);
    contaPoupanca.sacar(150);

    contaCorrente.depositar(600);
    contaCorrente.sacar(1500);
    contaCorrente.sacar(750);
    }
}
