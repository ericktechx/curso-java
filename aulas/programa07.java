package programas;
import java.util.Scanner;

/*
   - Receba dados do usuario enquanto a idade for maior que zero.
*/

//while
public class programa07 {
    
    public static void main(String[] args) {
    	//Declaração de variáveis
        int idade = 1;
        String nome;
        
        //para receber dados do usuario via teclado
        Scanner teclado = new Scanner(System.in);
        
        //Primeiro executa o bloco e depois faz a checagem
        while (idade > 0 ) {
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
