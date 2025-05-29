package atividade2;

import java.util.Scanner;

public class MediaN {
 
		    public static void main(String[] args) {
		    	Scanner sc = new Scanner(System.in);

		        System.out.print("Quantos números você deseja inserir? ");
		        int quantidade = sc.nextInt();

		        double soma = 0;

		        for (int i = 1; i <= quantidade; i++) {
		            System.out.print("Digite o " + i + "º número: ");
		            double numero = sc.nextDouble();
		            soma += numero;
		        }

		        double media = soma / quantidade;

		        System.out.println("A média dos números é: " + media);

		        sc.close();
		    
		    }
}


