package programa;

public class MyQueues {
	int MAX, tail ;
	int[] queue;
	public MyQueues(int size ) {
		this.tail=0;
		this.MAX = size;
		this.queue= new int[size];
	}
	public void insert (int data) {
		if(tail == MAX) {
		System.out.println("Queue is full");}
		else {
		queue[tail] = data;/* inserts data*/
		tail++; /* increases index*/
		}
		}}
