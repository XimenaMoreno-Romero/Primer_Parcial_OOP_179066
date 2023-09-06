package examen;

public class Palabras {
	
		public void conviertePrimeraLetraMayuscula(String cadena) 
		{
			String resultado = cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();
			System.out.println("Primera letra en mayuscula: "+resultado);
		}
		public void invierteCadena(String cadena) {
			String cadenaInvertida = "";
			for (int convercion = cadena.length() - 1; convercion >= 0; convercion--) {
				cadenaInvertida += cadena.charAt(convercion);
			}
			System.out.println("Cadena invertida: " + cadenaInvertida);	
		}
		public void compruebaPalindromo(String cadena) {
	        cadena = cadena.toLowerCase().replace(" ", "").replace(",",""); 
	        int contador = 0, largoDePalabra = cadena.length()-1;
	        boolean Error = false;
	        
	        while ((contador<largoDePalabra) && (!Error)){
	            if (cadena.charAt(contador) == cadena.charAt(largoDePalabra)){             
	                contador++;
	                largoDePalabra--;
	            } else {
	                Error = true;
	            }
	        }
	        if (!Error){
	            System.out.println(cadena + " : es un Palíndromo");
	        }else{
	            System.out.println(cadena + " : No es un Palíndromo");
	        }  
	    }
		public void convierteVocalesenMayuscula(String cadena) {
			cadena = cadena.replace("a", "A");
			cadena= cadena.replace("e", "E");
			cadena = cadena.replace("i", "I");
			cadena = cadena.replace("o", "O");
			cadena = cadena.replace("u", "U");
			System.out.println(cadena);
			}
	}
