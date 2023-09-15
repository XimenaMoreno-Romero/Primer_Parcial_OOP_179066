package actividad4;

public class MyQueues {
	int MAX, tail,head ;
	int[] queue;
	public MyQueues(int size ) {
		this.tail=0;
		this.MAX = size;
		this.queue= new int[MAX];
	}
	public void insert (int data) {
		if(tail == MAX) {
			System.out.println("Queue is full");
		}
		else {
			queue[tail] = data;/* inserts data*/
			tail++; /* increases index*/
		}
	}
	  public int delete(){
		  int i;
	        if (tail > 0){
	        	head= queue[0];
	        for ( i=0;i<tail-1;i++);{
	        	queue[i]=queue[i+1];
	        	
	        }
	        tail--;
	        return head;
	        	
	        }
	        else {
	        	  System.out.println("#");
	        }
			return '#';
	            
	    }
	
	}



