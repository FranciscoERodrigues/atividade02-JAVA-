package atividade2;

import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);

           System.out.print("Informe a base: ");
           double base = sc.nextDouble();

           System.out.print("Informe o expoente: ");
           int expoente = sc.nextInt();

           double potencia = Math.pow(base, expoente);

           System.out.println("\nResultado:");
           System.out.println(base + " elevado a " + expoente + " é igual a " + potencia);

           sc.close();
    }
}