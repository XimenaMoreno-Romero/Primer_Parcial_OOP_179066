package ACT4;
import java.util.Stack;
import java.util.Scanner;
public class MyStack {
	
	int MAX, top ;
	char[] stack;

	public MyStack(int size ) {
	this.stack= new char[size];
	top=0;
	MAX = size;
	
	}	
 public void push(char value){
	if(top == MAX)
		System.out.println("Stack is full");
	else {
		stack[top] = value; /* agrega un elemento*/
		top++; /* incrementa el valor de top */
	}
 }
 public char pop() {
	 int value;
	if (top == 0) {
		System.out.println("Stack is empty");
		return(0);
	}
	else {
		value= stack[top-1];
		top--; /*decreases top*/
		stack[top]=0;
		return (stack[top]) ;/*returns eliminated element*/
	}
 }
 public static void invertirLaCadena(String frase) {
     
     Stack<Character> stack = new Stack<>();
     for (int i = 0; i < frase.length(); i++) {
         stack.push(frase.charAt(i));
     }
     System.out.print("Cadena Invertida: ");
     while (!stack.isEmpty()) {
         System.out.print(stack.pop());
     }
 }
 public static void VerificarPalindromo(String frase) {
	 
     String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();
     Stack<Character> stack = new Stack<>();
     
     for (int i = 0; i < fraseSinEspacios.length(); i++) {
         stack.push(fraseSinEspacios.charAt(i));
     }
     StringBuilder fraseYaInvertida = new StringBuilder();
     while (!stack.isEmpty()) {
    	 fraseYaInvertida.append(stack.pop());
     }
     if (fraseSinEspacios.equals(fraseYaInvertida.toString())) {
         System.out.println(" "
         		+ "La frase es Palindromo.");
     } else {
         System.out.println(" "
         		+ "La frase no es Palindromo.");
     }
 }
 
}



