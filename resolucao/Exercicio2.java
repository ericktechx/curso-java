package resolucao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2, valor3, soma;
		
		System.out.print("Informe valor 1: ");
		valor1 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Informe valor 2: ");
		valor2 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Informe valor 3: ");
		valor3 = Integer.parseInt(teclado.nextLine());
		
		soma = valor1 + valor2 + valor3;
		System.out.println("A soma de " + valor1 + " com " + valor2 + " e " + valor3 + " é " + soma);
		
		teclado.close();
	}

}
