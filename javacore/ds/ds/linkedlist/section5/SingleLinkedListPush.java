package ds.linkedlist.section5;

/*
 * Singly Linked List - Push
Implement the following on the SinglyLinkedList class:

push

This function should take in a value and add o node to the end of the SinglyLinkedList.

Examples

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5)  // Success
singlyLinkedList.size   // 1
singlyLinkedList.head.value // 5
singlyLinkedList.tail.value // 5
 
singlyLinkedList.push(10)    // Success
singlyLinkedList.size      // 2
singlyLinkedList.head.value    // 5
singlyLinkedList.head.next.value  // 10
singlyLinkedList.tail.value    // 10

 */
public class SingleLinkedListPush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll=new SinglyLinkedList();
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
		
		

	}
	
	

}

class SinglyLinkedList{
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
}


