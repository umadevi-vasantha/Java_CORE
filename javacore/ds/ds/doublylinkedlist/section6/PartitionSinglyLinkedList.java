package ds.doublylinkedlist.section6;

/*
 * Partition
Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.

Example

Input: 1 -> 9 -> 5  -> 10 -> 2  [x=4]

Output: 2 -> 1 -> 9 -> 5 -> 10
 */
public class PartitionSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList2 ll=new SingleLinkedList2();
		ll.insertSingleLinkedList(1, 0);
		ll.insertSingleLinkedList(9, 1);
		ll.insertSingleLinkedList(5, 2);
		ll.insertSingleLinkedList(10, 3);
		ll.insertSingleLinkedList(2, 4);
		ll.traversal();
		System.out.println("After Partition");
		ll.partition(4);
		ll.traversal();
		

	}

}

class SingleLinkedList2 {
	public DNode head;
	public DNode tail;
	public int size;

	public DNode createSingleLinkedList(int nodevalue) {
		head = new DNode();
		DNode node = new DNode();
		node.value = nodevalue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertSingleLinkedList(int nodevalue, int location) {
		DNode node = new DNode();
		node.value = nodevalue;
		if (head == null) {
			createSingleLinkedList(nodevalue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			DNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			DNode nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
		// return true;
	}

	// Traversal of Singly Linked List
	// Time complexity: O(N)
	// Space complexity: O(1)
	public void traversal() {
		if (head == null) {
			System.out.println("No value in SLL");
		} else {
			DNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i < size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
			System.out.println("\n");
		}
	}
	
	//Partition
	//Time complexity : 
	//Space complexity :
	public void partition(int x) {
		DNode node = head;
		DNode prevNode=head;
		for(int i=0;i<x;i++) {
			prevNode=node;
			node=node.next;
		}
		prevNode.next=null;
		tail=prevNode;
		node.next=head;
		head=node;
		
		
		
	}
	}