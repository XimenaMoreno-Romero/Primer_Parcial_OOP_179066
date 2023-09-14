package programa;

public class MyStack {
	
		int MAX, top ;
		int[] stack;
	public MyStack(int size ) {
		this.top=0;
		this.MAX = size;
		this.stack= new int[size];
	}
		 public void push(int size)
		 {
		 if(top == MAX)
		 System.out.println("Stack is full");
		 else {
		 stack[top] = size; /* agrega un elemento*/
		 top++; /* incrementa el valor de top */
		 }}}
	 }
	 
	 public int pop()
	 {
	 if(top ==0 )
	 {
	 System.out.println(" Stack empty");
	 return ( top);
	 }
	 else {
	 top; /* decreases top */
	 return ( MAX); /*returns eliminated element*/
	 }
	 }

 }
