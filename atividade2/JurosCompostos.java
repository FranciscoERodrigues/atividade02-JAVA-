package atividade2;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o valor da capital:");
			float capital = sc.nextFloat();
			System.out.println("Digite o valor do juros:");
			float juros = sc.nextFloat();
			
			System.out.println("Digite o tempo:");
			int tempo = sc.nextInt();
			
			double resultado = capital*Math.pow(1+juros/100,tempo);
			System.out.println("O juros é de:" + resultado);
			
			sc.close();
			
		
	}

}
