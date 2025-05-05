package br.edu.principal;

import java.util.Scanner;

public class Principal {

   
    public static double calcularMedia(double n1, double n2, double n3, char tipo) {
        if (tipo == 'A' || tipo == 'a') {
            return (n1 + n2 + n3) / 3.0; 
        } else if (tipo == 'P' || tipo == 'p') {
            return (n1 * 5 + n2 * 3 + n3 * 2) / 10.0;
        } else {
            System.out.println("Tipo de média inválido. Use 'A' para aritmética ou 'P' para ponderada.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        
        System.out.print("Digite o tipo de média (A - Aritmética, P - Ponderada): ");
        char tipoMedia = scanner.next().charAt(0);

        
        double media = calcularMedia(nota1, nota2, nota3, tipoMedia);

       
        if (media != -1) {
            System.out.printf("A média calculada é: %.2f\n", media);
        }

        scanner.close();
    }
}