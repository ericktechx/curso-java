package exercicios;
//numero par ou ímpar

import java.util.Scanner;

public class ex006 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número: ");
		numero = Integer.parseInt(input.nextLine());
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}else {
			System.out.println("O número " + numero + " é ímpar.");
		}
		
		input.close();
	}
}
