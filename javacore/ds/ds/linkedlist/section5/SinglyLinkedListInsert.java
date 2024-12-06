package ds.linkedlist.section5;
/*
 * Singly Linked List - Insert
Implement the following on the SinglyLinkedList class:

Insert

This function should insert a node at a specified index in a  SinglyLinkedList. It should return true if the index is valid, and false if the index is invalid (less than 0 or greater the length of the list).

Examples

(Note: you do not need to re-implement push, the test will be provided with it)

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5);  // Success
singlyLinkedList.push(10);  // Success
singlyLinkedList.push(15);  // Success
singlyLinkedList.push(20);  // Success
 
singlyLinkedList.insert(12, 2);  // True
singlyLinkedList.insert(13, 100); // False
singlyLinkedList.size;         // 5
singlyLinkedList.head.data;      // 5
singlyLinkedList.head.next.data;   // 10
singlyLinkedList.head.next.next.data;  // 12
 
 */
public class SinglyLinkedListInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList2 sll=new SinglyLinkedList2();
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
		System.out.println("INSERT ****");
		System.out.println(sll.insert(13, 3));
		sll.traversal();
		System.out.println(sll.insert(8, 0));
		sll.traversal();
		System.out.println(sll.insert(11, 2));
		sll.traversal();
		System.out.println(sll.insert(11, 100));
		sll.traversal();
		
	}

}

class SinglyLinkedList2 {
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



	  //Insert
	  public boolean insert(int data, int index) {
		  //TODO
		  Node newNode= new Node();
		  newNode.data=data;
		  if(index<0 || index >size) {
			  return false;
		  }else {
		  if(head==null) {
			  insertSinglyLinkedList(data);
		  }else if(index==0) {
			  newNode.next=head;
			  head=newNode;
		  }else if(index>=size) {
			  newNode.next=null;
			  tail.next=newNode;
			  tail=newNode;
		  }else {
			  Node tempNode=head;
			  for(int i=0;i<index-1;i++) {
				  tempNode=tempNode.next;
			  }
			  Node nextNode=tempNode.next;
			  tempNode.next=newNode;
			  newNode.next=nextNode;
		  }
		  size++;
		  return true;
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

