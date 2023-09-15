package actividad4;

public class Ejecutador {
	public void iniciarPrograma() {
		MyStack newStack= new MyStack(8);
		MyQueues newQueue= new MyQueues(5);
		newStack.push(90);
		newStack.push(80);
		newStack.push(70);
		newStack.print();

		newStack.push(60);
		newStack.push(50);
		newStack.push(40);
		newStack.push(30);
		newStack.push(20);
		newStack.pop();
		newStack.print();
		
		//System.out.println();
		//int x = newStack.pop();
		//System.out.println(x);
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		
	
		newQueue.insert(6);
		newQueue.insert(3);
		newQueue.insert(4);
		newQueue.insert(3);
		newQueue.insert(2);
		newQueue.delete();
		newQueue.delete();	
		newQueue.delete();		
	}

}
