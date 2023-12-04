// Q2.Dados três valores A, B e C, crie um programa que imprima os valores de forma descendente (do maior para o menor).

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.print("Digite o primeiro numero: ");
        numeros.add(scanner.nextInt());
        System.out.print("Digite o segundo numero: ");
        numeros.add(scanner.nextInt());
        System.out.print("Digite o terceiro numero: ");
        numeros.add(scanner.nextInt());

        Collections.sort(numeros, Collections.reverseOrder());

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i)+" ");
        }
        scanner.close();
    }
}