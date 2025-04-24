package exercicios;
//Pedir 2 numeros e verificar o maior

import java.util.Scanner;

public class ex004 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, maior;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = Integer.parseInt(ler.nextLine());
		
		System.out.println("Informe o segundo valor: ");
		valor2 = Integer.parseInt(ler.nextLine());
		
		if(valor1 > valor2) {
			maior = valor1;
		}else {
			maior = valor2;
		}
		
		System.out.println("O maior valor informado foi " + maior);
		
		ler.close();
	}
}
