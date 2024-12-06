package ds.linkedlist.section5;
/*
 * Delete a Node from a Circular Singly Linked List
Implement a method in the CircularLinkedList class to delete a node by value.
 */
public class CircularSinglyDeleteNodeByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirSinglyLinkedList3 cirsll=new CirSinglyLinkedList3();
		cirsll.append(9);
//		cirsll.append(10);
//		cirsll.append(11);
//		cirsll.append(12);
//		cirsll.append(13);
		cirsll.traversal();
		System.out.println(cirsll.deleteByValue(9));
		cirsll.traversal();
//		cirsll.deleteByValue(13);
//		cirsll.traversal();
//		cirsll.deleteByValue(11);
//		cirsll.traversal();

	}

}

class CirSinglyLinkedList3{
	Node head;
	Node tail;
	int length;
	
	public CirSinglyLinkedList3() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	
	public void append(int value) {
        Node newNode = new Node();
        newNode.data=value;
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode; // Pointing to itself to make the list circular
        } else {
            this.tail.next = newNode;
            newNode.next = this.head;
            this.tail = newNode;
        }
        this.length++;
    }
	
	public void traversal() {
		if(head!=null) {
		Node tempNode=head;
		for(int i=0;i<length;i++) {
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


    @Override
    public String toString() {
        if (this.length == 0) {
            return "";
        }

        Node tempNode = this.head;
        StringBuilder result = new StringBuilder();

        do {
            result.append(tempNode.data);
            tempNode = tempNode.next;
            if (tempNode != this.head) {
                result.append(" -> ");
            }
        } while (tempNode != this.head);

        return result.toString();
    }

    public boolean deleteByValue(int value) {
        // TODO
    	 if (this.length == 0) {
             return false;
         }
  
         if (this.head == this.tail && this.head.data == value) {
             this.head = null;
             this.tail = null;
             this.length = 0;
             return true;
         }
         Node preNode=null;
         Node currentNode=this.head;
         do {
        	 if(currentNode.data==value) {
        		 if(currentNode==this.head) {
        			 this.head=this.head.next;
        			 this.tail.next=this.head;
        		 }else if(currentNode==this.tail) {
        			 preNode.next=this.head;
        			 this.tail=preNode;
        		 }else {
        			 preNode.next=currentNode.next;
        		 }
        		 this.length--;
        		 return true;
        	 }
        	 
        	 
        	 preNode=currentNode;
        	 currentNode=currentNode.next;
         }while(currentNode!=this.head);
         return false;
    }
    	
}
