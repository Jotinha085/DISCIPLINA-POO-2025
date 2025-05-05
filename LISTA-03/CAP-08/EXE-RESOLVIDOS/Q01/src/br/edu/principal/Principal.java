package br.edu.principal;

import java.util.Scanner;

public class Principal {

   
    public static int verificarPositivo(int numero) {
        if (numero >= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        
        int resultado = verificarPositivo(numero);

        
        if (resultado == 1) {
            System.out.println("O número é positivo ou zero (retorno: 1).");
        } else {
            System.out.println("O número é negativo (retorno: 0).");
        }

        scanner.close();
    }
}