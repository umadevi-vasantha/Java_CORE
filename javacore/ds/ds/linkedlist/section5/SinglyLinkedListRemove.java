package ds.linkedlist.section5;

/*
 * Singly Linked List - Remove
Implement a function on the SinglyLinkedList class which should remove a node at a specified index in a SinglyLinkedList. If the index is valid it should return the removed node otherwise it should return null.

Example

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5);  // Success
singlyLinkedList.push(10);  // Success
singlyLinkedList.push(15);  // Success
singlyLinkedList.push(20);  // Success
singlyLinkedList.push(25)  // Success
singlyLinkedList.remove(2).value // 15
singlyLinkedList.remove(100) // null
singlyLinkedList.sizesinglyLinkedList.remove(2).value   // 4
singlyLinkedList.head.value   // 5
singlyLinkedList.head.next.value  // 10
singlyLinkedList.head.next.next.value  // 20
 */
public class SinglyLinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList6 sll=new SinglyLinkedList6();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		
		System.out.println(sll.remove(0).data);
		
		System.out.println(sll.remove(3).data);
		
		System.out.println(sll.remove(1).data);
		

	}

}

class SinglyLinkedList6{
	public Node head;
	public Node tail;
	public int size;

	public Node insertSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.data = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void push(int nodeValue) {
		if (head == null) {
			insertSinglyLinkedList(nodeValue);
			return;
		} else {
			Node node = new Node();
			node.data = nodeValue;
			node.next = null;
			tail.next = node;
			tail = node;
			size++;
		}
	}



	 //Remove
	  public Node remove(int index) {
		  if(index<0 || index >size) {
			  return null;
		  }
		  Node rmNode;
		  Node currentNode;
		  if(index==0) {
			  rmNode=head;
			  if(head==tail) {
				  head=tail=null;
			  }
			  else {
				  head=head.next;
			  }
			  return rmNode;
		  }else {
			  currentNode= head;
			  for(int i=0;i<index-1;i++) {
				  currentNode=currentNode.next;
			  }
			  rmNode=currentNode.next;
			  Node nextNode = currentNode.next;
			  currentNode.next=nextNode.next;
			  return rmNode;
			  
			  
		  }
	  }
	   


}

