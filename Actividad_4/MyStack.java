package ACT4;
import java.util.Stack;
public class MyStrack {
	
	int MAX, top ;
	char[] stack;

	public MyStrack(int size ) {
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
 public  String invertirLaCadena(String str, MyStrack stack){
     String stringInvertido = "";
     for (int i = 0; i < str.length(); i++) {
         stack.push(str.charAt(i));
     }
     for (int i = 0; i < str.length(); i++) {
         stringInvertido = stringInvertido + stack.pop();
     }
     return stringInvertido;
 }
 
 public  boolean verificacionPalindromo(String str){
     String stringParanoespacios = "";
     String stringInvertido = "";
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == ' '){
         }else {
             stringParanoespacios = stringParanoespacios + str.toLowerCase().charAt(i);
         }
     }
     MyStrack stackparaPalindromo = new MyStrack(stringParanoespacios.length());
     for (int i = 0; i < stringParanoespacios.length(); i++) {
         stackparaPalindromo.push(stringParanoespacios.charAt(i));
     }
     for (int i = 0; i <stringParanoespacios.length(); i++) {
         stringInvertido = stringInvertido + stackparaPalindromo.pop();
     }
     if (stringInvertido.equals(stringParanoespacios)){
         return true;
     }else {
         return false;
     }
 }
}



