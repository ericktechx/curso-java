package programas;

//Operações Matemáticas
public class programa15 {

	public static void main(String[] args) {
		int num1 = 6, num2 = 10, res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);
		
		//Subtração
		res = num2 - num1;
		System.out.println("A subtração de " + num2 + " - " + num1 + " é " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);
		
		//Divisão Inteira
		res = num2 / num1;
		System.out.println("A divisão inteira de " + num2 + " / " + num1 + " é " + res);
		
		//Divisão real
		res2 = (float)num2 / (float)num1;  //cast
		System.out.println("A divisão real de " + num2 + " / " + num1 + " é " + res2);
		
		//Módulo
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);
		
		res = num2 % 3;
		System.out.println(num2 + " é divísivel por 3? " + res);
	}

}
