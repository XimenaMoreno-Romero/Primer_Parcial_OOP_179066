package ACT4;
import java.util.Scanner;
public class Ejecucion {
	
	public void iniciarPrograma() {
		String cadena, cadenayaInvertida = "";
		MyStrack newStack= new MyStrack(4);
		MyQueue newQueue= new MyQueue(5);
		System.out.println("Bienvenido al programa de Stacks y Queues");
		System.out.println("Escriba una frase");
		Scanner input = new Scanner(System.in);
        cadena = input.nextLine();
        MyStrack stackparaInvertir = new MyStrack(cadena.length());
        MyQueue queue1 = new MyQueue(cadena.length());
        cadenayaInvertida = newStack.invertirLaCadena(cadena, stackparaInvertir);
        
        System.out.println(cadenayaInvertida);
        if (newStack.verificacionPalindromo(cadena)){
            System.out.println("La frase es un palindromo");
        }else {
            System.out.println("La frase no es un palindromo");
        }
       
		
		
	}
}

