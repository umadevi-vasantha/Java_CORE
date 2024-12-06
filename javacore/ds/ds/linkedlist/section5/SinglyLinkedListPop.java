package ds.linkedlist.section5;

/*
 * Singly Linked List - Pop
Implement the following on the SinglyLinkedList class:

pop

This function should remove a node at the end of the SinglyLinkedList. It should return the node removed.

Examples

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5);
singlyLinkedList.push(10);
 
singlyLinkedList.pop().value // 10
singlyLinkedList.tail.value  // 5
singlyLinkedList.size;   // 1
singlyLinkedList.pop().value; // 5
singlyLinkedList.size;   // 0
singlyLinkedList.pop()   // The SLL does not exist
 */

public class SinglyLinkedListPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList1 sll=new SinglyLinkedList1();
		sll.push(9);
		System.out.println(sll.size);
		System.out.println(sll.head.data);
		System.out.println(sll.tail.data);
		sll.push(10);
		System.out.println(sll.size);
		System.out.println(sll.head.data);
		System.out.println(sll.head.next.data);
		System.out.println(sll.tail.data);
		sll.push(12);
		System.out.println(sll.size);
		System.out.println(sll.head.data);
		System.out.println(sll.head.next.next.data);
		System.out.println(sll.tail.data);
		System.out.println("POP ****");
		Node node =sll.pop();
		System.out.println(node.data);
		sll.traversal();
		
		Node node1 =sll.pop();
		System.out.println(node1.data);
		sll.traversal();
		Node node2 =sll.pop();
		System.out.println(node2.data);
		sll.traversal();
	}
	


}

class SinglyLinkedList1{
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
		head=new Node();
		Node newNode= new Node();
		newNode.data=nodeValue;
		newNode.next=null;
		head=newNode;
		tail=newNode;
		size=1;
		return newNode;
	}
	
	public void push(int nodeValue) {
		if(head==null) {
			Node newNode=createSinglyLinkedList(nodeValue);
			System.out.println("Success");
			return;
		}else {
			Node node= new Node();
			node.next=null;
			node.data=nodeValue;
			tail.next=node;
			tail=node;
			size++;
			
		}
	}
	
	public Node pop() {
		if(head==null) {
			System.out.println("The SLL does not exist");
			return null;
		}
		Node lastNode;
		if(head==tail) {
			lastNode=head;
			head=tail=null;
			size--;
			return lastNode;
		}else {
			Node tempNode=head;
			while(tempNode.next!=tail) {
				tempNode=tempNode.next;
			}
			tail=tempNode;
			lastNode=tempNode.next;
			tempNode.next=null;
			
			size--;
			return lastNode;
			
		
		}
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
			 System.out.println("\n");
			 
		 }
	 }
}