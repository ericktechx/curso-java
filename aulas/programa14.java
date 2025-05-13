package programas;

//Tipos Booleanos
public class programa14 {

	public static void main(String[] args) {
		// Tipo primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean ativo = false;
		
		// Tipos não primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
		System.out.println(); // 0 ou 1
		
		if(verdadeiro) {
			System.out.println("É Verdadeiro");
		}else {
			System.out.println("É Falso");
		}
		
		if(1 == 3) {
			System.out.println(" 1 == 1 é Verdadeiro");
		}else {
			System.out.println("... é falso");
		}
		
		if(ativo) {
			System.out.println("Pode acessar o sistema.");
		}else {
			System.out.println("Acesso negado.");
		}
	}

}
