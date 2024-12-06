package ds.doublylinkedlist.section6;

public class CircularDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirDoublyLinkedList cll= new CirDoublyLinkedList();
		cll.createDoublyLinkedList(7);
//		System.out.println(cll.head.value);
//		System.out.println(cll.tail.value);
		cll.insert(8, 0);
		cll.traversal();
		cll.insert(9, 1);
		cll.traversal();
		cll.insert(10, 2);
		cll.traversal();
		cll.insert(11, 2);
		cll.traversal();
		cll.insert(13, 4);
		cll.traversal();
		cll.reverseTraversal();
		System.out.println(cll.search(10));
		System.out.println(cll.search(13));
		System.out.println(cll.search(100));
		cll.deleteElement(0);
		cll.traversal();
		cll.reverseTraversal();
		cll.deleteElement(5);
		cll.traversal();
		cll.reverseTraversal();
		cll.deleteElement(2);
		cll.traversal();	
	    cll.reverseTraversal();
	    cll.delete();

	}

}

class CirDoublyLinkedList{
	DNode head;
	DNode tail;
	int length;
	
	public CirDoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	//Create Doubly Linked List
	//Time complexity: O(1)
	//Space complexity: O(1)
	public DNode createDoublyLinkedList(int value) {
		DNode newNode=new DNode();
		newNode.value=value;
		newNode.next=newNode;
		newNode.prev=null;
		this.head=newNode;
		this.tail=newNode;
		this.length=1;
		return head;
		
	}
	
	//Insertion in Doubly Linked List
	//Time complexity: O(N)
	//Space complexity: O(1)
	public void insert(int value, int location) {
		DNode newNode=new DNode();
		newNode.value=value;
		if(location<0 || location > this.length) {
			System.out.println("Not valid location");
			return;
		}
		if(head==null) {
			createDoublyLinkedList(value);
			System.out.println("Create a Circular Doubly Linked List");
			return;
		}else if(location==0) {
			newNode.prev=null;
			newNode.next=this.head.next;
			this.head.prev=newNode;
			this.head=newNode;
			this.tail.next=newNode;
			this.length++;
			System.out.println("Inserted  at start");
		}else if(location==this.length) {
			this.tail.next=newNode;
			newNode.prev=this.tail;
			newNode.next=this.head;
			this.tail=newNode;
			this.length++;
			System.out.println("Inserted at the End");
		}else {
			DNode tempNode=this.head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
				
			}
			newNode.prev=tempNode;
			newNode.next=tempNode.next;
			tempNode.next.prev=newNode;
			tempNode.next=newNode;
			this.length++;
			System.out.println("Inserted at a particular location");
		}
	}
	
	//Traversal
	//Time Complexity : O(N)
	//Space Complexity: O(1)
	public void traversal() {
		DNode tempNode= this.head;
		for(int i=0;i<this.length;i++) {
			System.out.print(tempNode.value);
		    System.out.print(" -> ");
			tempNode=tempNode.next;
		}
		System.out.print(this.head.value);
		System.out.print("\n");
	}
	
	
	
	//Reverse Traversal
	//Time complexity : O(N)
	//Space complexity : O(1)
	public void reverseTraversal() {
		System.out.println("Reversal Traversal");
		if(this.head!=null) {
			DNode tempNode=this.tail;
			System.out.print(this.head.value + "->");
			for(int i=0;i<this.length;i++) {
				System.out.print(tempNode.value);
				if(i<this.length-1) {
					System.out.print(" -> ");
				}
				tempNode=tempNode.prev;
			}
			System.out.println("\n");
		}else {
			System.out.println("No Doubly Linked List Exist");
		}
	}
	
	
	//Search 
	//Time complexity: O(N)
	//Space complexity: O(1)
	public boolean search(int value) {
		if(head !=null) {
			DNode tempNode= this.head;
			for(int i=0;i<this.length;i++) {
				if(tempNode.value==value) {
					System.out.println("Elemen found at i"+ i);
					return true;
				}
				tempNode=tempNode.next;
			}
			
			System.out.println("Element not found");
			return false;
		}else {
			System.out.println("No Circular Doubly Linked list Exist");
			return false;
		}
		
	}
	
	//Delete in Circular Doubly Linked List
	//Time complexity: O(N)
	//Space complexity: O(1)
	public void deleteElement(int location) {
		if(location <0 || location>this.length) {
			System.out.println("Not valid index");
			return;
		}
		if(this.head==null) {
			System.out.println(" No Doubly Linked List");
			return;
		}else if(location==0) {
			if(this.head==this.tail) {
				this.head.prev=null;
				this.head.next=null;
				this.head=this.tail=null;
				this.length--;
				return;
			}else {
				this.head=this.head.next;
				this.head.prev=this.tail;
				this.tail.next=this.head;
				this.length--;
			}
			System.out.println("Deleted the element from start");
		}else if(location==this.length){
			if(this.head==this.tail) {
				this.head=this.tail=null;
				this.length--;
				return;
			}else {
				this.tail=this.tail.prev;
				this.tail.next=this.head;
				this.head.prev=this.tail;
				this.length--;
			}
			System.out.println("Deleted the element from end");
			}else {
				DNode tempNode=this.head;
				for(int i=0;i<location-1;i++) {
					tempNode=tempNode.next;
				}
				tempNode.next=tempNode.next.next;
				tempNode.next.prev=tempNode;
				System.out.println("Deleted the element from between");
				this.length--;
		}
	}
	
	//Delete Enitre Elements
	//Time complexity:
	//Space complexity:
	public void delete() {
		DNode tempNode =this.head;
		for(int i=0;i<length;i++) {
			tempNode.prev=null;
			tempNode=tempNode.next;
			
		}
		this.head.prev=null;
		this.tail.next=null;
		this.head=this.tail=null;
		System.out.println("Successfully deleted");
	}
}
