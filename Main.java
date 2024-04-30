package Questão01;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Midia[] cadastro = new Midia[3];
        int op;
        
        for (int i = 0; i < 2; i++){ 
            Scanner scanner = new Scanner (System.in);
            
            System.out.print("\nO item para cadastro é: 1 -> CD ou 2 -> DVD: ");
            op = scanner.nextInt();
            
            if (op == 1){
                cadastro [i] = new CD();
            }   
            
            else {
                cadastro [i] = new DVD ();
            }
            
            cadastro[i].inserirDados();
        }
        
        for (int i = 0; i < 2; i++){
            System.out.println("Produtos cadastrados:\n"); 
            cadastro[i].printDados();
        }
    }
}
