package programas;

//foreach --> Para Cara
public class programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra); // pula uma linha
			//System.out.print(letra); // nao pula linha	
		}
	}

}
