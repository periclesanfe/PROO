/* Crie um programa capaz de ler três valores para os lados de um triângulo e verificar se os lados fornecidos formam realmente um triângulo. Se esta condição for verdadeira, deve ser indicado qual tipo de triângulo foi formado: isósceles, escaleno ou equilátero. Sabendo que:
Um triângulo é chamado de equilátero se todos os lados possuem a mesma medida.
Um triângulo é chamado de isósceles se dois lados possuem a mesma medida.
Um triângulo é chamado de escaleno se todos os lados possuem medidas diferentes. */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        scanner.close();
    }
}