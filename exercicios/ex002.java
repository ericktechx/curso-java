// Receber 3 valores inteiro e retornar a soma
package exercicios;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		//Declaração de Variáveis
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, soma = 0;
		
		//Entradas do usuário
		System.out.printf("Informe o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Informe o segundo número: ");
		num2 = ler.nextInt();
		
		System.out.printf("Informe o terceiro número: ");
		num3 = ler.nextInt();
		
		//Saída dos valores
		soma = num1 + num2 + num3;
		System.out.printf("A soma dos valores é: %d", soma);
	}

}
