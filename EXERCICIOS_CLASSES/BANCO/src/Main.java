import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.  Abrir uma conta");
            System.out.println("2.  Sacar");
            System.out.println("3.  Depositar");
            System.out.println("4.  Mostrar saldo");
            System.out.println("5.  Sair");
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    banco.abrirConta();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(valorDeposito);
                    break;
                case 4:
                    banco.mostrarSaldo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao == 5) {
                break;
            }
        }
    }
}