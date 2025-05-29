package atividade2;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Atribua a primeira nota:");
			double nota1 = sc.nextDouble();
			System.out.println("Atribua o primeiro peso:");
			double peso1 = sc.nextDouble();
			System.out.println("Atribua a segunda nota:");
			double nota2 = sc.nextDouble();
			System.out.println("Atribua o segundo peso:");
			double peso2 = sc.nextDouble();
			System.out.println("Atribua a terceira nota:");
			double nota3 = sc.nextDouble();
			System.out.println("Atribua o terceiro peso:");
			double peso3 = sc.nextDouble();
			
			double media = nota1*(peso1)+nota2*(peso2)+ nota3*(peso3);
			double ponderada = media/ (peso1+peso2+peso3);
			System.out.println("A media ponderada é:" + ponderada);
	sc.close();		
	}

}
