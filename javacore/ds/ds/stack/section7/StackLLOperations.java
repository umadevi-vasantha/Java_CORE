package ds.stack.section7;

public class StackLLOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		Stack1 stack=new Stack1();
		System.out.println(stack.isEmpty());
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		stack.delete();
		System.out.println(stack.peek());
		

	}

}


class Stack1{
	
	SingleLinkedList ll;
	
	public Stack1() {
		ll= new SingleLinkedList();
	}
	
	//Push 
	//Time complexity: O(1)
	//Space complexity: O(1)
	public void push(int value) {
		this.ll.insertSingleLinkedList(value, 0);
		System.out.println("Inserted value in stack");
		
	}
	
	//Is Empty
	//Time complexity: O(1)
	//Space complexity: O(1)
	public boolean isEmpty() {
		if(this.ll.head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	//Pop 
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int pop() {
		int result =-1;
		if(this.ll.head==null) {
			System.out.println("The Stack is empty");
		}else {
			result=this.ll.head.data;
			this.ll.delete(0);
		}
		return result;
	}
	
	//Peek
	//Time complexity: O(1)
	//Space complexity: O(1)
	public int peek() {
		int result=-1;
		if(this.ll.head==null) {
			System.out.println("The Stack is empty");
		}else {
			result=this.ll.head.data;		
			}
		return result;
	}
	
	//Delete Stack
	//Time complexity: O(1)
	//Space complexity: O(1)
	public void delete() {
		this.ll.head=null;
		System.out.println("The stack is successfully deleted");
		}
	
	
}

class SingleLinkedList{
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSingleLinkedList(int nodevalue) {
		head = new Node();
		Node node= new Node();
		node.data = nodevalue;
		node.next=null;
		head= node;
		tail=node;
		size=1;
		return head;
	}
	 public void insertSingleLinkedList(int nodevalue, int location)
	 {
		 Node node = new Node();
		 node.data= nodevalue;
		 if(head==null) {
			 createSingleLinkedList(nodevalue);
			 return;
		 }else if(location==0) {
			 node.next=head;
			 head=node;
		 }else if(location>=size)
		 {
			 node.next=null;
			 tail.next=node;
			 tail=node;
			 }else {
				 Node tempNode =head;
				 int index=0;
				 while(index< location-1) {
					 tempNode = tempNode.next;
					 index++;
				 }
				 Node nextNode=tempNode.next;
				 tempNode.next=node;
				 node.next=nextNode;
			 }
		 size++;
		 //return true;
		 }
	
	
	//Traversal of Singly Linked List
	//Time complexity: O(N)
	 //Space complexity: O(1)
	 public void traversal() {
		 if(head==null) {
			 System.out.println("No value in SLL");
		 }else {
			 Node tempNode=head;
			 for(int i=0; i<size;i++) {
				 System.out.print(tempNode.data);
				 if(i<size -1) {
					 System.out.print(" -> ");
				 }
				 tempNode = tempNode.next;
			 }
		 }
	 }
	 
	 //Searching in Singly Linked List
	 //Time complexity: O(N)
	 //Space complexity: O(1)
	 public boolean search(int searchValue) {
		 if(head==null) {
			 System.out.println("There is no element in Singly Linked List");
			 return false;
		 }else {
			 Node tempNode = head;
			 for(int i=0; i<size;i++) {
				 if(searchValue==tempNode.data) {
					 System.out.println("Element found");
					 return true; 
				 }
				 tempNode=tempNode.next;
			 }
			 
		 }
		 System.out.println("Element Not found");
		 return false;
	 }
	 
	 //Deletion in Singly Linked List
	 //Time complexity: O(N)
	 //Space complexity: O(1)
	 public void delete(int location) {
		 if(head==null) {
			 System.out.println("The SLL doesnot exist");
			 return;
		 }else if(location==0) {
			 head = head.next;
			 size--;
			 if(size==0) {
				 tail=null;
			 }
		 }else if(location>=size) {
			 Node tempNode=head;
			 for(int i=0;i<size-1;i++) {
				 tempNode=tempNode.next;
			 }
			 if(tempNode==head) {
				 head=tail=null;
				 size--;
				 return;
			 }
			 tempNode.next=null;
			 tail=tempNode;
			 size--;
		 }else {
			 Node tempNode = head;
			 for(int i=0; i<location-1; i++) {
				 tempNode= tempNode.next;
			 }
			 tempNode.next= tempNode.next.next;
			 size--;
			
		 }
	 }
	 
	 //Deletion of entire singly linked list
	 //Time complexity : O(1)
	 //Space complexity: O(1)
	 public void deleteEntireSinglyLinkedList() {
		 head=tail=null;
		 System.out.println("The SLL deleted successfully");
		 size=0;
		
	 }
	
}


class Node{
	public int data;
	public Node next;
	
}
