package programas;

//Tipos de dados alfanuméricos
//caracteres e strings
public class programa13 {

	public static void main(String[] args) {
		//Tipos primitivos
		char letra1 = 'a';  //Aspas Simples
		char letra2 = 97;  //97 em decimal == 'a'
		
		//char letra4 = "b"; //errado
		//string nome = "adsdsda"; // Não existe o tipo primitivo string em Java
		
		System.out.println("Letra2 " + letra2);
		
		letra2 = (char) (letra2 + 1);  //cast
		
		System.out.println("Letra1 " + letra1);
		System.out.println("Letra2 " + letra2);
		
		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println("Letra3 " + letra3);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Valor Min char/Character " + Character.MIN_VALUE); //0
		System.out.println("Valor Max char/Character " + Character.MAX_VALUE); //65535
		
		System.out.println("Nome: " + nome);
		
		System.out.println("Tamanho da String: " + nome.length());
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
	}

}
