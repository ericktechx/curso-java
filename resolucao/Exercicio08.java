package exercicios;

public class Exercicio08 {

	public static void main(String[] args) {
		int i;
		
		//for
		for(i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		i = 1; //resetando a variável
		
		//while
		while(i <= 100) {
			System.out.println(i);
			i = i + 1;
		}
		i = 1; //resentando			
		
		//do while
		do {
			System.out.println(i);
			i = i + 1;			
		} while(i <= 100);

	}

}
