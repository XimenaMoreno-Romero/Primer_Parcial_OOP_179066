package programa;
import java.util.Scanner;
public class Ejecutador {
	public static void ejecucionPrograma(){	
		MyStack stackLlamado = new MyStack(0);
		Scanner recibidorFrase = new Scanner(System.in);
		String fraseRecibida = "";
		String fraseInversa = "";
		
		System.out.println("Bienvenido al programa de la Act # 4");
		System.out.println("Ingresa una frase: ");
		fraseRecibida = recibidorFrase.nextLine();
		MyStack stacks = new MyStack(fraseRecibida.length());
		MyQueue queues = new MyQueue(fraseRecibida.length());
		fraseInversa = stackLlamado.inversorDelaFase (fraseRecibida, stacks);
		System.out.println("La frase invertida es: "+ fraseInversa);
		
		if(stackLlamado.verificarPalindromo (fraseRecibida)){
			System.out.println("Es palíndromo");
		}
		else {
			System.out.println("No es palíndromo");
		}
	}
