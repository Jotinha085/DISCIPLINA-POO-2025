package br.edu.principal;

import java.util.Scanner;

public class Principal {

   
    public static int calcularDuracao(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFim * 60 + minutoFim;

    
        if (fimEmMinutos >= inicioEmMinutos) {
            return fimEmMinutos - inicioEmMinutos;
        } else {
           
            return (1440 - inicioEmMinutos) + fimEmMinutos;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a hora de início (0-23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite os minutos de início (0-59): ");
        int minutoInicio = scanner.nextInt();

        
        System.out.print("Digite a hora de término (0-23): ");
        int horaFim = scanner.nextInt();

        System.out.print("Digite os minutos de término (0-59): ");
        int minutoFim = scanner.nextInt();

        
        int duracao = calcularDuracao(horaInicio, minutoInicio, horaFim, minutoFim);

       
        System.out.println("Duração do jogo: " + duracao + " minutos.");

        scanner.close();
    }
}
    