package resolucao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("informe o primeiro número: ");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("informe o segundo número: ");
		num2 = Integer.parseInt(teclado.nextLine());
		
		if(num1 > num2) {
			System.out.println("O maior número é o primeiro número: " + num1);
		}else if(num1 == num2) {
			System.out.println("Os dois número são iguais.");
		}else {
			System.out.println("O maior número é o segundo número: " + num2);
		}
		
		teclado.close();
	}
}
