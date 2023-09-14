package programa;

public class Ejecutador {
	public void iniciarPrograma() {
		MyStack newStack= new MyStack(8);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		newStack.push(30);
		
		MyQueues newQueue= new MyQueues(8);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		newQueue.insert(30);
		
	}

}
