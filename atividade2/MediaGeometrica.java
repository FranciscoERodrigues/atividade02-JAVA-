package atividade2;
import java.util.Scanner;


public class MediaGeometrica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
				System.out.println("Digite o 1° numero:");
				double numero01 = sc.nextDouble();
				System.out.println("Digite o 2° numero:");
				double numero02 = sc.nextDouble();
				System.out.println("Digite o 3° numero:");
				double numero03 = sc.nextDouble();
				double mediaGeometrica = Math.cbrt(numero01*numero02*numero03);
				System.out.println("A media geometrica dos numeros digitados é: " + mediaGeometrica);
				
			sc.close();
	}	
	
}
