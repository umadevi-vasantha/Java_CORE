package ds.stack.section7;

public class StackOperationsUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack6 stack=new Stack6(4);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		stack.delete();
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	}

}

class Stack6{
	int[] arr;
	int topOfStack;
	
	//Creating a Stack
	//Time complexity: O(1)
	//Space complexity: O(N)
	public Stack6(int size) {
		this.arr=new int[size];
		this.topOfStack=-1;
		System.out.println("The Stack is Successfully created with size "+size);
	}
	
	//Is Stack Empty
	//Time complexity: O(1)
	//Space complexity: O(1)
	public boolean isEmpty() {
		if(this.topOfStack==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	//Is Stack Full
	//Time complexity : O(1)
	//Space complexity : O(1)
	public boolean isFull() {
		if(this.topOfStack==arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//Push Operation in Stack
	//Time complexity: O(1)
	//Space complexity: O(1)
	public void push(int value) {
		if(isFull()) {
			System.out.println("The Stack is Full");
		}else {
			arr[this.topOfStack+1]=value;
			this.topOfStack++;
			System.out.println("The element is successfully inserted");
		}
	}
	
	
	//Pop Operations in Stack
	///Time complexity: O(1)
	//Space complexity: O(1)
	public int pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		}else {
			int result= arr[this.topOfStack];
			this.topOfStack--;
			return result;
		}
	}
	
	//Peek Operation in stack
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		}else {
			int result=arr[this.topOfStack];
			return result;
		}
		}
	

    //Delete Operation in stack
    //Time complexity: O(1)
    //Space complexity: O(1)
    public void delete() {
    	arr=null;
    	System.out.println("The Stack is successfully deleted");
    	}
    
}
