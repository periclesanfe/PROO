import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terca-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"};

        System.out.print("Digite um numero inteiro entre 1 e 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            String diaDaSemana = diasDaSemana[numero - 1];
            System.out.println(diaDaSemana);
        } else {
            System.out.println("Nao existe dia da semana com esse numero.");
        }

        scanner.close();
    }
}
