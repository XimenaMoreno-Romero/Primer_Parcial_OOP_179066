package programa;

public class MyQueue {
	 int[] queue;
	    int MAX;
	    int tail;
	    int Head;
	    public MyQueue(int size){
	        this.queue = new int[size];
	        this.MAX = size;
	        this.tail = 0;
	    }
	    public void insert (int data){
	        if(tail == MAX)
	            System.out.println("Queue is full");
	        else {queue[tail] = data;/* inserts data*/
	            tail++; /* increases index*/}
	    }
	    public int delete(){
	        if (tail != 0){
	            Head = queue[0];
	            for (int i = 0; i < queue[tail-1]; i++) {
	                queue[i] = queue[i+1];
	            }
	            tail = tail - 1;
	            return Head;
	        }else {
	        	 System.out.println("#");
	            return '#';
	        }
	    }
}


