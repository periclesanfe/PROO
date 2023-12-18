import java.util.Scanner;

public class Locadora {
    DVD[] DVDs_disponiveis = new DVD[100];
    DVD[] DVDs_locados = new DVD[100];
    Cliente[] clientes = new Cliente[100];
    double taxa_de_locacao = 2.5;


    void adicionarDVD() {
        Scanner scanner = new Scanner(System.in);
        DVD novoDVD = null;

        for (int i = 0; i < DVDs_disponiveis.length; i++) {
            if (DVDs_disponiveis[i] == null) {
                System.out.println("Digite o titulo do DVD: ");
                String titulo = scanner.nextLine();
                System.out.println("Digite o genero do DVD: ");
                String genero = scanner.nextLine();
                System.out.println("Digite o diretor do DVD: ");
                String diretor = scanner.nextLine();
                System.out.println("Digite o ano do DVD: ");
                int ano = scanner.nextInt();
                novoDVD = new DVD(titulo, genero, diretor, ano);

                DVDs_disponiveis[i] = novoDVD;
                break;
            }
        }
    }


    void removerDVD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo do DVD: ");
        String titulo = scanner.nextLine();

        for (int i = 0; i < DVDs_disponiveis.length; i++) {
            if (DVDs_disponiveis[i].titulo.equals(titulo)) {
                DVDs_disponiveis[i] = null;
                break;
            }
        }
    }

    void adicionarCliente() {
        Scanner scanner = new Scanner(System.in);
        Cliente novoCliente = null;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                System.out.println("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o endereco do cliente: ");
                String endereco = scanner.nextLine();
                System.out.println("Digite o telefone do cliente: ");
                String telefone = scanner.nextLine();
                System.out.println("Digite o email do cliente: ");
                String email = scanner.nextLine();
                novoCliente = new Cliente(nome, endereco, telefone, email);

                clientes[i] = novoCliente;
                break;
            }
        }
    }

    void alugarDVD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].nome.equals(nome)) {
                System.out.println("Digite o titulo do DVD: ");
                String titulo = scanner.nextLine();

                for (int j = 0; j < DVDs_disponiveis.length; j++) {
                    if (DVDs_disponiveis[j].titulo.equals(titulo)) {
                        clientes[i].alugarDVD(DVDs_disponiveis[j]);
                        DVDs_disponiveis[j].alugar(clientes[i].nome);

                        for (int k = 0; k < DVDs_locados.length; k++) {
                            if (DVDs_locados[k] == null) {
                                DVDs_locados[k] = DVDs_disponiveis[j];
                                DVDs_disponiveis[j] = null;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
    }

    void devolverDVD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].nome.equals(nome)) {
                System.out.println("Digite o titulo do DVD: ");
                String titulo = scanner.nextLine();

                for (int j = 0; j < DVDs_locados.length; j++) {
                    if (DVDs_locados[j].titulo.equals(titulo)) {
                        clientes[i].devolverDVD(DVDs_locados[j]);
                        DVDs_locados[j].devolver();

                        for (int k = 0; k < DVDs_disponiveis.length; k++) {
                            if (DVDs_disponiveis[k] == null) {
                                DVDs_disponiveis[k] = DVDs_locados[j];
                                DVDs_locados[j] = null;
                                break;
                            }
                        }

                        break;
                    }
                }
                break;
            }
        }
    }

    void verificarDisponibilidade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo do DVD: ");
        String titulo = scanner.nextLine();

        for (int i = 0; i < DVDs_disponiveis.length; i++) {
            if (DVDs_disponiveis[i].titulo.equals(titulo)) {
                System.out.println("O DVD "+titulo+" está disponível");
                break;
            }
        }
        System.out.println("O DVD "+titulo+" não está disponível");
    }

    void calcularValorAluguel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        while (dias > 3 || dias < 1) {
            System.out.println("Só é permitido alugar um DVD por três dias\nDigite a quantidade de dias: ");
            dias = scanner.nextInt();
        }

        System.out.println("O valor do aluguel é: R$"+(dias*taxa_de_locacao));
    }

    void listarDVDs(){
        System.out.println("DVDs disponiveis: ");
        for (int i = 0; i < DVDs_disponiveis.length; i++) {
            if (DVDs_disponiveis[i] != null) {
                DVDs_disponiveis[i].imprimir();
            }
        }

        System.out.println("DVDs locados: ");
        for (int i = 0; i < DVDs_locados.length; i++) {
            if (DVDs_locados[i] != null) {
                DVDs_locados[i].imprimir();
            }
        }
    }

    void listarClientes(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                clientes[i].imprimir();
            }
        }
    }
}