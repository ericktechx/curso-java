package programas;
import java.util.Scanner;

//for
public class programa09 {

	public static void main(String[] args) {
		int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);
        
        //variável de controle; condição de parada; forma de incremento
        // i++ -> i = i + 1
        for (int i = 0; i < 5; i++) {	        	
	        System.out.println("Informe seu nome: ");
	        nome = teclado.nextLine();
	    
	        System.out.println("Informe sua idade: ");
	        //idade = teclado.nextInt();  //bug
	         
	        //recebe uma string e coverte para int
	        idade = Integer.parseInt(teclado.nextLine());
	        
	        if (idade > 0) {
	            System.out.println(nome + " tem " + idade + " anos.");
	        }
        }
        
        teclado.close();	
    
	}

}
