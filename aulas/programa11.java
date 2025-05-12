package programas;

//Tipos de Dados
//Númericos (Inteiros e Reais)
public class programa11 {

	public static void main(String[] args) {
		//Tipos primários
		long num0 = 99; //Inteiro muito grande
		int num1= 4;  //Inteiro 
		short num2 = 4; // Inteiro (curto/menor/baixo)
		byte num3 = 4;  // Inteiro (ainda menor do que o short);
		char num8 = 38;
		
		//Tipos não primários/primitivos
		Long num7 = (long) 999999999; //Cast
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Character num9 = 35;
		
		System.out.println("long -> Num 0 = " + num0);
		System.out.println("int -> Num 1 = " + num1);
		System.out.println("short -> Num 2 = " + num2);
		System.out.println("byte -> Num 3 = " + num3);
		System.out.println("char -> Num 8 = " + num8);
		
		System.out.println("Long -> Num 0 = " + num7);
		System.out.println("Integer -> Num 4 = " + num4);
		System.out.println("Short -> Num 5 = " + num5);
		System.out.println("Byte -> Num 6 = " + num6);
		System.out.println("Character -> Num 9 = " + num9);
		
		//Tamanho Ocupado em memória
		System.out.println("\nlong/Long " + Long.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		//Tamanho máximo e minímo de cada tipo
		System.out.println("\nValor Min long/Long " + Long.MIN_VALUE);
		System.out.println("Valor Max long/Long " + Long.MAX_VALUE);
		
		System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short " + Short.MAX_VALUE);
		
		System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " + Byte.MAX_VALUE);
		
		// System.out.println("Valor Min char/Character " + Character.MIN_VALUE); //0
		// System.out.println("Valor Max char/Character " + Character.MAX_VALUE); //65535
	}

}
