package examen;

import java.util.Scanner;

public class Ejecucion {
	public void iniciarPrograma() {
		String cadena1= "hasta luego cocodrilo";
		String cadena2= "anita lava la tina";
	
		Palabras modificador=new Palabras();
		modificador.conviertePrimeraLetraMayuscula(cadena1);
		modificador.invierteCadena(cadena1);
		modificador.conviertePrimeraLetraMayuscula(cadena2);
		modificador.invierteCadena(cadena2);
		modificador.convierteVocalesenMayuscula(cadena2);
		modificador.convierteVocalesenMayuscula(cadena1);
		modificador.compruebaPalindromo(cadena1);
		modificador.compruebaPalindromo(cadena2);
		Scanner opcion= new Scanner(System.in);
		System.out.println("Deseas ejecutar el metodo FiizBuzz");
		System.out.println("1. SI 2.NO");
		String selecciondeopcion=opcion.nextLine();
		int definitivaopcion=Integer.parseInt(selecciondeopcion);
		if (definitivaopcion==1) {
			new Extra().ejecutaContadordeFizzbzzparamultiplosde3y5();
		}
		else {
			System.out.println("Gracias por utilizar el programa");
		}
}
}
