package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static void mostrarTabuada(int numero) {
        if (numero < 1 || numero > 9) {
            System.out.println("Número inválido. Digite um número entre 1 e 9.");
            return;
        }

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número entre 1 e 9: ");
        int numero = scanner.nextInt();

        
        mostrarTabuada(numero);

        scanner.close();
    }
}