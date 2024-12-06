package ds.linkedlist.section5;

public class CircularSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirSinglyLinkedList cirsll= new CirSinglyLinkedList();
		cirsll.createCirSinglyLinkedList(10);
		System.out.println(cirsll.head.data);
		System.out.println(cirsll.tail.data);
		System.out.println(cirsll.head.next.data);
		cirsll.insertion(9, 0);
		cirsll.traversal();
		cirsll.insertion(12, 2);
		cirsll.traversal();
		cirsll.insertion(11, 2);
		cirsll.traversal();
		cirsll.insertion(13, 4);
		cirsll.traversal();
		cirsll.insertion(15, 5);
		cirsll.search(15);
		cirsll.search(9);
		cirsll.search(11);
		cirsll.delete(0);
		cirsll.traversal();
		cirsll.delete(4);
		cirsll.traversal();
		cirsll.delete(1);
		cirsll.traversal();
		cirsll.delete();
		cirsll.traversal();
		

	}
	
}

class CirSinglyLinkedList{
	Node head;
	Node tail;
	int size;
	
	//Creation of CircularSinglyLinkedList
	//Time Complexity : O(1)
	//Space Complexity: O(1)
	public Node createCirSinglyLinkedList(int nodeValue) {
		head=new Node();
		Node newNode= new Node();
		newNode.data= nodeValue;
		newNode.next=newNode;
		head=newNode;
		tail=newNode;
		size=1;
		return head;
	}
	
	//Insertion in CircularSinglyLinkedList
	//Time complexity: O(N)
	//Space complexity: O(1)
	public void insertion(int nodeValue , int location) {
		Node node= new Node();
		node.data=nodeValue;
		if(location<0 || location > size) {
			System.out.println("Value cannot be inserted");
			return;
		}
		if(location == 0) {
			if(head==null) {
				createCirSinglyLinkedList(nodeValue);
				return;
			}
			node.next= head;
			head=node;
			tail.next=node;
			size++;
		}else if(location== size){
			node.next=head;
			tail.next=node;
			tail=node;
			size++;
		}else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
			size++;
		}
	}
	
	//Traversal in Circural Singly Linked List
	//Time complexity:  O(N)
	//Space complexity: O(1)
	public void traversal() {
		if(head!=null) {
		Node tempNode=head;
		for(int i=0;i<size;i++) {
			System.out.print(tempNode.data);
			tempNode=tempNode.next;
			System.out.print(" -> ");
		}
		System.out.print(tail.next.data);
		System.out.println("\n");
	}else {
		System.out.println("The Circular Singly Linked list is not available");
	}
	}
	
	//Search in Circular Singly Linked List
	//Time complexity: O(N)
	//Space complexity: O(1)
	public boolean search(int searchValue) {
		if(head==null) {
			System.out.println("No Circular Singly Linked list exist");
			return false;
		}else {
			Node tempNode=head;
			for(int i=0; i<size;i++) {
				if(searchValue==tempNode.data) {
					System.out.println("Element found at i "+ i);
					return true;
				}
				tempNode=tempNode.next;
			}
			System.out.println("Element Not found");
			return false;
		}
	}
	
	//Delete in Circular Singly linked list
	//Time complexity: O(N)
	//Space complexity: O(1)
	public void delete(int location) {
		if(location< 0 || location >size) {
			System.out.println("Not a valid index");
			return;
		}
		if(location==0) {
			head=head.next;
			tail.next=head;
			size--;
			if(size==0) {
				head.next=null;
				head=tail=null;
				return;
			}
			
		}else if(location==size) {
			Node tempNode=head;
			for(int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
			if(tempNode==head) {
				head.next=null;
				head=tail=null;
				return;
			}
			tail=tempNode;
			tempNode.next=head;
			size--;
			
		}else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
			
		}
	}
	
	//Delete Enitre Circular linked list
	//Time Complexity: O(1)
	//Space complexity: O(1)
	public void delete() {
		if(head==null) {
			System.out.println("No Linked List available");
		}else {
		tail.next=null;
		head=tail=null;
		System.out.println("Deleted the Entire Circular Linked List");
		size=0;
		}
	}
}
