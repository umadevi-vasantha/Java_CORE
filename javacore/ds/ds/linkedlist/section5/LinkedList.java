package ds.linkedlist.section5;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll= new SingleLinkedList();
		sll.createSingleLinkedList(10);
		//System.out.println(sll.head.data);
		//System.out.println(sll.head.next);
		sll.insertSingleLinkedList(11,0);
		sll.insertSingleLinkedList(12, 2);
		sll.insertSingleLinkedList(13, 2);
		sll.insertSingleLinkedList(15, 3);
		
//System.out.println(sll.head.data);
//System.out.println(sll.head.next.data);
//System.out.println(sll.head.next.next.data);
//System.out.println(sll.head.next.next.next.data);
		sll.traversal();
		sll.search(13);
		sll.search(14);
		sll.delete(0);
		sll.delete(5);
		sll.delete(2);
		sll.traversal();
		sll.deleteEntireSinglyLinkedList();
		sll.traversal();
		System.out.println(sll.size);

	}

}

class SingleLinkedList{
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSingleLinkedList(int nodevalue) {
		head = new Node();
		Node node= new Node();
		node.data = nodevalue;
		node.next=null;
		head= node;
		tail=node;
		size=1;
		return head;
	}
	 public void insertSingleLinkedList(int nodevalue, int location)
	 {
		 Node node = new Node();
		 node.data= nodevalue;
		 if(head==null) {
			 createSingleLinkedList(nodevalue);
			 return;
		 }else if(location==0) {
			 node.next=head;
			 head=node;
		 }else if(location>=size)
		 {
			 node.next=null;
			 tail.next=node;
			 tail=node;
			 }else {
				 Node tempNode =head;
				 int index=0;
				 while(index< location-1) {
					 tempNode = tempNode.next;
					 index++;
				 }
				 Node nextNode=tempNode.next;
				 tempNode.next=node;
				 node.next=nextNode;
			 }
		 size++;
		 //return true;
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
		 }
	 }
	 
	 //Searching in Singly Linked List
	 //Time complexity: O(N)
	 //Space complexity: O(1)
	 public boolean search(int searchValue) {
		 if(head==null) {
			 System.out.println("There is no element in Singly Linked List");
			 return false;
		 }else {
			 Node tempNode = head;
			 for(int i=0; i<size;i++) {
				 if(searchValue==tempNode.data) {
					 System.out.println("Element found");
					 return true; 
				 }
				 tempNode=tempNode.next;
			 }
			 
		 }
		 System.out.println("Element Not found");
		 return false;
	 }
	 
	 //Deletion in Singly Linked List
	 //Time complexity: O(N)
	 //Space complexity: O(1)
	 public void delete(int location) {
		 if(head==null) {
			 System.out.println("The SLL doesnot exist");
			 return;
		 }else if(location==0) {
			 head = head.next;
			 size--;
			 if(size==0) {
				 tail=null;
			 }
		 }else if(location>=size) {
			 Node tempNode=head;
			 for(int i=0;i<size-1;i++) {
				 tempNode=tempNode.next;
			 }
			 if(tempNode==head) {
				 head=tail=null;
				 size--;
				 return;
			 }
			 tempNode.next=null;
			 tail=tempNode;
			 size--;
		 }else {
			 Node tempNode = head;
			 for(int i=0; i<location-1; i++) {
				 tempNode= tempNode.next;
			 }
			 tempNode.next= tempNode.next.next;
			 size--;
			
		 }
	 }
	 
	 //Deletion of entire singly linked list
	 //Time complexity : O(1)
	 //Space complexity: O(1)
	 public void deleteEntireSinglyLinkedList() {
		 head=tail=null;
		 System.out.println("The SLL deleted successfully");
		 size=0;
		
	 }
	
}


class Node{
	public int data;
	public Node next;
	
}
