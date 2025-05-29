package atividade2;

import java.util.Scanner;

	public class Soma {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();
	        int soma = 0;

	     
	        numero = Math.abs(numero);

	        while (numero > 0) {
	            int digito = numero % 10;  
	            soma += digito;            
	            numero /= 10;      
	            
	         sc.close();
	        }

	        System.out.println("Soma dos dígitos: " + soma);
	      
	    }	
	   
	    }
	
