// Crie um programa para verificar se um número é bissexto. Para saber se um ano é bissexto existe uma regra básica: os anos bissextos são aqueles múltiplos de 4, ou seja, a cada quatro anos temos um ano bissexto. Por outro lado, esses anos não são múltiplos de 100 (por exemplo,1800, 1900, 2100), exceto os múltiplos de 400 (por exemplo, 1600, 2000, 2400).

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }
}