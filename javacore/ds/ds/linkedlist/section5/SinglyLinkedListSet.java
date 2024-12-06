package ds.linkedlist.section5;



/*
 * Singly Linked List - Set
Implement the following on the SinglyLinkedList class:

Set

This function should accept an index and a value and update the value of the node in the SinglyLinkedList at the index with new value. It should return true if the node is updated successfully or false if an invalid index is passed in.

Examples

(Note: you do not need to re-implement push, the test will be provided with it)

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(1);
singlyLinkedList.push(2);

singlyLinkedList.set(0,10);  // True
singlyLinkedList.set(1,20);  // True
singlyLinkedList.head.value;  // 10
singlyLinkedList.head.next.val // 20
 */
public class SinglyLinkedListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList5 sll=new SinglyLinkedList5();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		sll.traversal();
		System.out.println(sll.set(0, 5));
		System.out.println(sll.set(1, 10));
		System.out.println(sll.set(2, 15));
		System.out.println(sll.set(5, 100));
		sll.traversal();
	}

}

class SinglyLinkedList5 {
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

	// Traversal of Singly Linked List
	// Time complexity: O(N)
	// Space complexity: O(1)
	public void traversal() {
		if (head == null) {
			System.out.println("No value in SLL");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.data);
				if (i < size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
			System.out.println("\n");

		}
	}

	// Set

	public boolean set(int index, int value) {
		// TODO
		if(index<0 || index>=size) {
			return false;
		}
		Node tempNode= head;
		for(int i=0;i<index;i++) {
			tempNode=tempNode.next;
		}
		tempNode.data=value;
		return true;
	}

}
