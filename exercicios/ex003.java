//Receber um número real e mostras o quadrado desse número
package exercicios;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		//Declaração de Variáveis
		Scanner ler = new Scanner(System.in);
		float num, quadrado = 0;
		
		//Entrada
		System.out.println("Informe um número: ");
		num = ler.nextFloat();
		
		//Saída -- O Ponto Flutuante em Java se utiliza virgula(,);
		quadrado = num * 2;
		System.out.printf("O Quadrado é: %.2f", quadrado);  //%f para float
		
	}

}
