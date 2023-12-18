import java.util.Scanner;

public class Banco {
    /*
Crie uma classe chamada Banco, com os seguintes atributos: saldo, nomeTitular.
E com as seguintes operações: sacar, depositar, mostrar saldo. */
    double saldo;
    String nomeTitular;


    void sacar(double valor){
        saldo = saldo - valor;
        mostrarSaldo();
    }

    void depositar(double valor){
        saldo = saldo + valor;
        mostrarSaldo();
    }

    void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    void abrirConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        this.nomeTitular = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        this.saldo = scanner.nextDouble();

        System.out.println("Conta aberta com sucesso!");
    }
}
