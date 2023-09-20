package programa;

public class MyStack {
	int MAX, top;
	char [] stack;
	
	public MyStack(int size) {
		this.top = 0;
		this.MAX = size;
		this.stack = new char [size];
	}
	public void push(char data){
		if(top == MAX) {
			System.out.println("Stack is full");
		}
		else {
				stack[top] = data; 
				top++; 
			}
	}
	public char pop(){
		if(top == 0){
			System.out.println("Stack is empty");
			return(0);
		}
		else {
			top--; /* decreases top */
			return(stack[top]); /*returns eliminated element*/
		}
	}
	public static String inversorDelaFase(String frase, MyStack stack) {
		String fraseInvertida = "";
		for (int i = 0; i < frase.length(); i++) {
			stack.push(frase.charAt(i));
		}
		for(int i = 0; i < frase.length(); i++) {
			fraseInvertida = fraseInvertida + stack.pop();
		}
		return fraseInvertida;
	}
	public static boolean verificarPalindromo(String frase) {
		String fraseSinEspacio = "";
		String fraseInvertida = "";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
	
			}
			else {
				fraseSinEspacio = fraseSinEspacio + frase.toLowerCase().charAt(i);
			}
		}
		
		MyStack stackP = new MyStack(fraseSinEspacio.length());
		for (int i = 0; i < fraseSinEspacio.length(); i++) {
			stackP.push(fraseSinEspacio.charAt(i));
		}
		for (int i = 0; i < fraseSinEspacio.length(); i++) {
			fraseInvertida = fraseInvertida + stackP.pop();
		}
		if (fraseInvertida.equals(fraseSinEspacio)) {
			return true;
		}
		else {
			return false;
		}
       }
}



