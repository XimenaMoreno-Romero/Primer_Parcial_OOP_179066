package actividad4;

public class MyStack {
	
	int MAX, top ;
	int[] stack;

	public MyStack(int size ) {
	this.top=0;
	this.MAX = size;
	this.stack= new int[size];
	}
	
	
 public void push(int value){
	if(top == MAX)
		System.out.println("Stack is full");
	else {
		stack[top] = value; /* agrega un elemento*/
		top++; /* incrementa el valor de top */
	}
 }
 public int pop() {
	 int value;
	if (top == 0) {
		System.out.println("Stack is empty");
		return(0);
	}
	else {
		value= stack[top-1];
		top--; /*decreases top*/
		stack[top]=0;
		return(value);/*returns eliminated element*/
	}
 }
 public void print() {
	 for (int i=0;i<top;i++) {
		 System.out.println("stack "+stack[i]);
	 }
 }
}


