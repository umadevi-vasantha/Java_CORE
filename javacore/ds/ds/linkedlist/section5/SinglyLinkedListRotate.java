package ds.linkedlist.section5;

/*
 * 
Singly Linked List - Rotate
Implement the following on the SinglyLinkedList class:

Rotate

This function should rotate all the nodes in the list by some number passed in. For instance, if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2. The number passed in  to rotate can be any integer.

Time Complexity : O(N), where N is the length of the list.

Space Complexity : O(1)

Examples

(Note: you do not need to re-implement push, the test will be provided with it)

singlyLinkedList = SinglyLinkedList()
singlyLinkedList.push(5)  // Success
singlyLinkedList.push(10)  // Success
singlyLinkedList.push(15)  // Success
singlyLinkedList.push(20)  // Success
singlyLinkedList.push(25)  // Success
 
singlyLinkedList.rotate(3)
 
singlyLinkedList.head.data  // 20
singlyLinkedList.head.next.data   // 25
singlyLinkedList.head.next.next.data  // 5
singlyLinkedList.head.next.next.next.data // 10
singlyLinkedList.head.next.next.next.next.data // 15
singlyLinkedList.tail.data // 15
 */

public class SinglyLinkedListRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList4 sll=new SinglyLinkedList4();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		sll.traversal();
		sll.rotate(2);
		sll.traversal();
		SinglyLinkedList4 sll1=new SinglyLinkedList4();
		sll1.push(5);
		sll1.push(10);
		sll1.push(15);
		sll1.push(20);
		sll1.push(25);
		sll1.traversal();
		sll1.rotate(3);
		sll1.traversal();

	}

}

 class SinglyLinkedList4 {
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
  //Rotate

 
	  public String rotate(int number) {
		    // TODO
		    int index = number;
		    if (number < 0) {
		      index = number + size;
		    }
		    if (index < 0 || index >= size) {
		      return null;
		    }
		    if (index == 0) {
		      return "No Rotation";
		    }
		    Node tempNode=head;
			  for(int i=0;i<number-1;i++) {
				  tempNode=tempNode.next;
			  }
			  if(tempNode==null){
			      return "No Rotation";
			  }
			  tail.next=head;
			  head=tempNode.next;
			  tempNode.next=null;
			  tail=tempNode;
			  return "Success";
		  }

	  
  }
    
  



