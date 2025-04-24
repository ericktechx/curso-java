package programas;

//Operador Ternário
public class programa05 {
	
	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*
		if(valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		
		//Operador Ternário  =  if,else (simples)
		numero = (valor > 0) ? valor : 7;  //Numa linha, é a mesma coisa que o if, else
		
		System.out.println(numero);
	}
}
