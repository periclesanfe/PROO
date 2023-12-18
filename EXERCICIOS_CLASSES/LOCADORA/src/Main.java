import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        while (true) {
            System.out.println("1 - Adicionar DVD");
            System.out.println("2 - Remover DVD");
            System.out.println("3 - Adicionar Cliente");
            System.out.println("4 - Alugar DVD");
            System.out.println("5 - Devolver DVD");
            System.out.println("6 - Imprimir DVDs");
            System.out.println("7 - Imprimir Clientes");
            System.out.println("8 - Sair");
            System.out.println("Digite a opcao desejada: ");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    locadora.adicionarDVD();
                    break;
                case 2:
                    locadora.removerDVD();
                    break;
                case 3:
                    locadora.adicionarCliente();
                    break;
                case 4:
                    locadora.alugarDVD();
                    break;
                case 5:
                    locadora.devolverDVD();
                    break;
                case 6:
                    locadora.listarDVDs();
                    break;
                case 7:
                    locadora.listarClientes();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}
