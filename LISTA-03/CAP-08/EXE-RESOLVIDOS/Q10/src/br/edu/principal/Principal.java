package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static double calcularS(int N) {
        double S = 1.0; 
        
        
        for (int i = 1; i <= N; i++) {
            S += 1.0 / fatorial(i);
        }

        return S;
    }

    
    public static int fatorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

   
    public static double aplicarEquacao(double S) {
        return 2 * S + 5; // Exemplo de equação f(S) = 2S + 5
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor de N (inteiro e positivo): ");
        int N = scanner.nextInt();

        
        if (N <= 0) {
            System.out.println("Por favor, insira um valor de N positivo.");
            scanner.close();
            return;
        }

       
        double S = calcularS(N);
        
       
        System.out.println("O valor de S para N = " + N + " é: " + S);

        
        double resultadoEquacao = aplicarEquacao(S);

       
        System.out.println("O resultado da equação 2S + 5 é: " + resultadoEquacao);

        scanner.close();
    }
}