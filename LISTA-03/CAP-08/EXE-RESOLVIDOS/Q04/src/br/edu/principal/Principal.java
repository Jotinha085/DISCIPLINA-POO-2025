package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static void converterTempo(int totalSegundos, int[] tempo) {
        tempo[0] = totalSegundos / 3600;            
        tempo[1] = (totalSegundos % 3600) / 60;      
        tempo[2] = totalSegundos % 60;               
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de segundos: ");
        int segundos = scanner.nextInt();

        
        int[] tempoConvertido = new int[3];

        
        converterTempo(segundos, tempoConvertido);

        
        System.out.printf("Resultado: %d horas, %d minutos e %d segundos\n",
                tempoConvertido[0], tempoConvertido[1], tempoConvertido[2]);

        scanner.close();
    }
}