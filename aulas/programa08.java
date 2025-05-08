package programas;
import java.util.Scanner;

/*
   - Receba dados do usuario enquanto a idade for maior que zero.
*/

//do while
public class programa08 {
    
    public static void main(String[] args) {
        int idade;
        String nome;
        
        //para receber dados do usuario via teclado
        Scanner teclado = new Scanner(System.in);
        
        //Primeiro executa o bloco e depois faz a checagem
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
        
            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt();  //bug
             
            //recebe uma string e coverte para int
            idade = Integer.parseInt(teclado.nextLine());
            
            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }    
        } while (idade > 0 );
        
        teclado.close();
    }
    
}
