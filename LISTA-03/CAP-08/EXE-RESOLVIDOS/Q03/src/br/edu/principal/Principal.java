package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static int somarDivisiveis(int a, int b, int c) {
        int soma = 0;

        
        int inicio = Math.min(b, c);
        int fim = Math.max(b, c);

        for (int i = inicio; i <= fim; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o valor de a (maior que 1): ");
        int a = scanner.nextInt();

        
        if (a <= 1) {
            System.out.println("Erro: 'a' deve ser maior que 1.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        
        int resultado = somarDivisiveis(a, b, c);
        System.out.println("A soma dos números entre " + b + " e " + c + " divisíveis por " + a + " é: " + resultado);

        scanner.close();
    }
}

