package resolucao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int conta_10 = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) { //matriz[0..][0..]
				System.out.println("Informe o valor inteiro para a matriz["+i+"]"+"["+j+"]: ");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());
				
				if(matriz[i][j] > 10) {
					conta_10 = conta_10 + 1;
				}
			}
		}
		System.out.println("A matriz possui " + conta_10 + " Valores maiores que 10.");
		teclado.close();
	}
}
