package ds.doublylinkedlist.section6;



public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLinkedList dll= new DLinkedList();
		//dll.createDLinkedList(10);
		dll.insertDLinkedList(10, 0);
		dll.traversal();
		dll.insertDLinkedList(11,1);
		dll.traversal();
		dll.reverseTraversal();
		dll.insertDLinkedList(3, 2);
		dll.traversal();
		dll.reverseTraversal();
		dll.insertDLinkedList(4, 2);
		dll.insertDLinkedList(5, 4);
		dll.traversal();
		dll.reverseTraversal();
		dll.search(4);
		dll.search(10);
		dll.search(100);
		dll.delete(0);
		dll.traversal();
		dll.delete(4);
		dll.traversal();
		dll.delete(1);
		dll.traversal();
		dll.deleteDLL();
		dll.traversal();
		

	}

}

class DLinkedList{
	DNode head;
	DNode tail;
	int length;

	
	public DLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	//Creating a Doubly linked list
	//Time complexity: O(1)
	//Space complexity: O(1)
	public DNode createDLinkedList(int value) {
		this.head= new DNode();
		DNode newNode=new DNode();
		newNode.value=value;
		newNode.next=null;
		newNode.prev=null;
		this.head=newNode;
		this.tail=newNode;
		this.length=1;
		System.out.println("Created a new element");
		return this.head;
		
	}
	
	//Insertion a Doubly Linked list
	//Time complexity: O(N)
	//Space complexity: O(1)
	public void insertDLinkedList(int value, int location) {
		DNode newNode= new DNode();
		newNode.value=value;
		if(location<0 || location> this.length) {
			System.out.println("Invalid location");
			return;
		}
		if(this.head==null) {
			createDLinkedList(value);
			return;
		}
		if(location==0) {
			
				newNode.next=this.head;
				newNode.prev=null;
				this.head.prev=newNode;
				this.head=newNode;
				this.length++;
				System.out.println("Inserted at 0 index");
				
			
		}else if(location ==this.length) {
			newNode.prev=this.tail;
			newNode.next=null;
			this.tail.next=newNode;
			this.tail=newNode;
			this.length++;
			System.out.println("Inserted at end");
		}else {
			DNode tempNode= this.head;
			for(int i=0;i< location-1;i++) {
				tempNode=tempNode.next;
			}
			DNode nextNode=tempNode.next;
			newNode.next=nextNode;
			newNode.prev=tempNode;
			tempNode.next=newNode;
			nextNode.prev=newNode;
			this.length++;
			System.out.println("Inserted at Middle");
		}
	}
	
	//Traversal in Circural Singly Linked List
		//Time complexity:  O(N)
		//Space complexity: O(1)
		public void traversal() {
			System.out.println("Traversal");
			if(this.head!=null) {
			DNode tempNode=this.head;
			for(int i=0;i<length;i++) {
				System.out.print(tempNode.value);
				tempNode=tempNode.next;
				if(i<length-1) {
				System.out.print(" -> ");
				}
			}
			
			System.out.println("\n");
		}else {
			System.out.println("The Circular Singly Linked list is not available");
		}
		}
		
		//Reverse Traversal
		//Time complexity : O(N)
		//Space complexity : O(1)
		public void reverseTraversal() {
			System.out.println("Reversal Traversal");
			if(this.head!=null) {
				DNode tempNode=this.tail;
				for(int i=0;i<this.length;i++) {
					System.out.print(tempNode.value);
					if(i<this.length-1) {
						System.out.print(" - ");
					}
					tempNode=tempNode.prev;
				}
				System.out.println("\n");
			}else {
				System.out.println("No Doubly Linked List Exist");
			}
		}
		
		//Search 
		//Time complexity: O(1)
		//Space complexity: O(1)
		public void search(int value) {
			if(this.head==null) {
				System.out.println("No Doubly Linked List Exist");
				return;
			}else {
				DNode tempNode=this.head;
				for(int i=0;i<length;i++) {
					if(tempNode.value==value) {
						System.out.println("Value found at index i:"+ i);
						return;
					}
					tempNode=tempNode.next;
				}
				System.out.println("No value found");
			}
		}
		//Delete a Node
		//Time complexity: O(N)
		//Space complexity: O(1)
		public void delete(int location) {
			if(location<0 || location>this.length) {
				System.out.println("Not a valid location");
				return;
			}
			if(this.head==null) {
				System.out.println("DLL does'nt exist");
				return;
				
			}else{
				if(location==0) {
					if(this.head==this.tail) {
						this.head=this.tail=null;	
						this.length--;
						return;
					}else {
					this.head.next.prev=null;
					this.head=this.head.next;
					this.length--;
					}
				}else if(location==this.length) {
					if(this.head==this.tail) {
						this.head=this.tail=null;	
						this.length--;
						return;
					}else {
					this.tail.prev.next=null;
					this.tail=this.tail.prev;
					this.length--;
					}
				}else {
					DNode tempNode=this.head;
					for(int i=0;i<location-1;i++) {
						tempNode=tempNode.next;
					}
					tempNode.next=tempNode.next.next;
					tempNode.next.prev=tempNode;
					this.length--;	
				}
			}
		}
		
		//delete entire linked list
		//Time complexity: O(N)
		//Space complexity: O(1)
		public void deleteDLL() {
			DNode node= this.head;
			for(int i=0;i<length;i++) {
				node.prev=null;
				node=node.next;
			}
			this.head=this.tail=null;
			this.length=0;
			System.out.println("Entire DLL is removed");
		}
		
}


class DNode{
	int value;
	DNode next;
	DNode prev;
}