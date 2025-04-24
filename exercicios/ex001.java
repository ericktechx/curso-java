// Ler um Número Inteiro e Imprimir
package exercicios;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		//Cria objeto scanner para ler entradas
		Scanner ler = new Scanner(System.in);
		int num;  //Inicia variável numero
		
		System.out.println("Informe um número: ");
		num = ler.nextInt();
		
		System.out.printf("O número foi: %d", num);
		
	}

}
