package ds.queue.section8;

public class LinearQueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 queue=new Queue1(5);
		System.out.println(queue.isFull());
		System.out.println(queue.isEmpty());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		queue.delete();
		System.out.println(queue.isEmpty());
		}

}

class Queue1{
	int[] arr;
	int front;
	int end;
	
	//Creating a queue
	//Time complexity : O(1)
	//Space complexity: O(N)
	public Queue1(int size) {
		this.arr = new int[size];
		this.front=-1;
		this.end=-1;
		System.out.println("The Queue is successfully created with the size of "+ size);
		}
	
	
	//IsFull
	//Time complexity: O(1)
	//Space complexity: O(1)
	public boolean isFull() {
		if(this.end==this.arr.length-1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//IsEmpty
	//Time complexity : O(1)
	//Space complexity: O(1)
	public boolean isEmpty() {
		if(this.front==-1 || this.front==this.arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	//EnQueue
	//Time complexity : O(1)
	//Space complexity: O(1)
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("The Queue is full");
			return;
		}else if(isEmpty()) {
			this.front=0;
			this.end++;
			this.arr[this.end]=value;
			System.out.println("Successfully Inserted in the queue");
		}else {
			this.end++;
			this.arr[this.end]=value;
			System.out.println("Successfully Inserted in the Queue");
		}
	}
	
	//DeQueue
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("The Queue is Empyt");
			return -1;
		}else {
			int result= arr[this.front];
			this.front++;
			if(this.front> this.end) {
				this.front=this.end=-1;
			}
			return result;
		}
		
	}
	
	//Peek
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is empty");
			return -1;
		}else {
			return this.arr[this.front];
		}
	}
	
	//Delete Queue
	//Time complexity: O(1)
	//Space complexity: O(1)
	public void delete() {
		this.arr=null;
		System.out.println("The queue is Successfully deleted");
	}
	
	
	
}