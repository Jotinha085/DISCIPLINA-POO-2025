package br.edu.principal;

import java.util.Scanner;

public class Principal {

   
    public static double calcularPercentual(double valorAntigo, double valorAtual) {
        if (valorAntigo == 0) {
            return 0; 
        }
        return ((valorAtual - valorAntigo) / valorAntigo) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor antigo do produto: R$ ");
        double valorAntigo = scanner.nextDouble();

        System.out.print("Digite o valor atual do produto: R$ ");
        double valorAtual = scanner.nextDouble();

        
        double percentual = calcularPercentual(valorAntigo, valorAtual);

        
        System.out.printf("O acréscimo percentual foi de: %.2f%%\n", percentual);

        scanner.close();
    }
}