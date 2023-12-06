import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terca-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"};

        try {
            System.out.print("Digite um numero inteiro entre 1 e 7: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.println(diasDaSemana[0]);
                    break;
                case 2:
                    System.out.println(diasDaSemana[1]);
                    break;
                case 3:
                    System.out.println(diasDaSemana[2]);
                    break;
                case 4:
                    System.out.println(diasDaSemana[3]);
                    break;
                case 5:
                    System.out.println(diasDaSemana[4]);
                    break;
                case 6:
                    System.out.println(diasDaSemana[5]);
                    break;
                case 7:
                    System.out.println(diasDaSemana[6]);
                    break;
                default:
                    System.out.println("Nao existe dia da semana com esse numero.");
                    break;
            }
        } catch(Exception e) {
            System.out.println("Tipo de dado inválido!");
        } finally {
            scanner.close();
        }
    }
}
