package br.edu.principal;

import java.util.Scanner;

public class Principal {

  
    public static int somaEntre(int num1, int num2) {
        int soma = 0;

      
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        
        for (int i = menor + 1; i < maior; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int numero2 = scanner.nextInt();

        
        if (numero1 < 0 || numero2 < 0) {
            System.out.println("Os dois números devem ser positivos.");
        } else {
            int resultado = somaEntre(numero1, numero2);
            System.out.println("A soma dos números inteiros entre " + numero1 + " e " + numero2 + " é: " + resultado);
        }

        scanner.close();
    }
}