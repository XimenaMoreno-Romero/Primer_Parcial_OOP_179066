package ACT4;
import java.util.Scanner;
public class Ejecucion {
	
	public void iniciarPrograma() {
		 System.out.print("Bienvenido al programa  Stakc y Queue ");
		Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una frase:");
        MyStrack stacktest=new MyStrack(5);
		MyQueue queuetest= new MyQueue(5);
        String frase = scanner.nextLine();
        scanner.close();
        stacktest.invertirLaCadena(frase);
        
		stacktest.VerificarPalindromo(frase);     
		queuetest.insert(12);
		stacktest.push('a');
		stacktest.pop();     
		
		
	}
}

