package ds.linkedlist.section5;

/*
 * 
Singly Linked List - Get
Implement the following on the SinglyLinkedList class:

get

This function should find a node at a specified index in a  SinglyLinkedList. It should return the found node.

Examples

singlyLinkedList = SinglyLinkedList();
singlyLinkedList.push(5);  // Success
singlyLinkedList.push(10);  // Success
singlyLinkedList.push(15);  // Success
singlyLinkedList.push(20);  // Success
 
singlyLinkedList.get(0).value;    // 5
singlyLinkedList.get(1).value;    // 10
singlyLinkedList.get(2).value;   // 15
singlyLinkedList.get(3).value;    // 20
singlyLinkedList.get(4).value;    // Null
 */
public class SinglyLinkedListGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList3 sll=new SinglyLinkedList3();
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
		
		System.out.println("GET ****");
		System.out.println(sll.get(0).data);
		System.out.println(sll.get(1).data);
		System.out.println(sll.get(2).data);
		System.out.println(sll.get(3).data);
		System.out.println(sll.get(4).data);
		System.out.println(sll.get(5).data);
		System.out.println(sll.get(6).data);


	}

}

class SinglyLinkedList3 {
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

	  
	  
	//Get
	  public Node get(int index) {
	    //TODO
		  if (index<0 || index > size) {
		      return null;
		    }
		  Node tempNode= head;
		  for(int i=0;i<index;i++) {
			  tempNode=tempNode.next;
		  }
		  return tempNode;
	  }

}






