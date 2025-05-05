package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static void encontrarMaiorEMenor() {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 valores inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        scanner.close();
    }

    public static void main(String[] args) {
        
        encontrarMaiorEMenor();
    }
}