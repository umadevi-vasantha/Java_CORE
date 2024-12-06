package ds.linkedlist.section5;

/*
 * Implement a Circular Singly Linked List
Create a circular singly linked list with methods to insert a new node at the beginning, end, and toString  to display the list. 
 */
public class CircularSinglyAppendAndPrepend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirSinglyLinkedList1 cirsll= new CirSinglyLinkedList1();
		cirsll.append(9);
		cirsll.append(10);
		cirsll.prepend(8);
		cirsll.traversal();

	}

}

class CirSinglyLinkedList1{
	Node head;
    Node tail;
    int length;

    public CirSinglyLinkedList1() {
        this.head=null;
        this.tail=null;
        this.length=0;
        // TODO
    }
    
    public Node createCirSinglyLinkedList(int value) {
    	Node node=new Node();
    	node.data=value;
    	node.next=node;
    	this.head=node;
    	this.tail=node;
    	this.length=1;
    	return this.head;
    }

    public void append(int value) {
        // TODO
    	Node newNode= new Node();
    	newNode.data=value;
    	if(this.head==null) {
    		createCirSinglyLinkedList(value);
    		return;
    	}else {
    		newNode.next=this.head;
    		this.tail.next=newNode;
    		this.tail=newNode;
    		this.length++;
    	}
    	
    }

    public void prepend(int value) {
        // TODO
    	Node newNode=new Node();
    	newNode.data=value;
    	if(this.head==null) {
    		createCirSinglyLinkedList(value);
    		return;
    	}else {
    		newNode.next=this.head;
    		this.head=newNode;
    		this.tail.next=newNode;
    		this.length++;
    		
    	}
    	
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
        // TODO
    	else {
    	StringBuilder result = new StringBuilder();
    	Node tempNode=this.head;
    	for(int i=0;i<length;i++) {
    		result.append(tempNode.data);
    		tempNode=tempNode.next;
    		while(i<length-1) {
    			result.append(" -> ");
    		}
    	}
    	return result.toString();
    	}
    	
    }
	
}
