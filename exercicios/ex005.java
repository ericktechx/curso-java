package exercicios;
//Digite num se for positivo fazer a raiz quadrada, neg dizer invalido

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		double raizquadrada;
		
		System.out.println("Informe um número inteiro: ");
		valor = Integer.parseInt(ler.nextLine());
		
		if(valor > 0) {
			raizquadrada = Math.sqrt(valor);
			System.out.println("A Raiz quadrada é " + raizquadrada);
		}else {
			System.out.println("Número inválido. Tente Novamente!");
		}
		
		ler.close();
	}
}
