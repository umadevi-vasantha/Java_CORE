package ds.doublylinkedlist.section6;
/*
 * Remove Dups
Write a method to remove duplicates from an unsorted linked list.

Example

linkedList = 1->2->1->3
deleteDups(linkedList)
//Output
1->2->3
 */

public class LinkedListActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertSingleLinkedList(1, 0);
		sll.insertSingleLinkedList(2, 1);
		sll.insertSingleLinkedList(1, 2);
		sll.insertSingleLinkedList(3, 3);
		sll.insertSingleLinkedList(1, 4);
		sll.traversal();
		sll.removeDuplicate();
		sll.traversal();
	}

}

class SingleLinkedList {
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
		}
	}

	// Remove Duplicates
	// Time complexity : O(N^2)
	// Space complexity : O(1)
	public void removeDuplicate() {
		if (head == null) {
			System.out.println("No Linked list exist");
		} else {

			for (DNode compareNode = head; compareNode != null; compareNode = compareNode.next) {
				DNode prevNode = compareNode;
				for (DNode tempNode = compareNode.next; tempNode != null;) {
					if (compareNode.value == tempNode.value) {
						// Deletion Code
						prevNode.next = tempNode.next;
						if (tempNode == tail) {
							tail = prevNode;
						}
						size--;
						tempNode = prevNode.next;

					} else {
						prevNode = tempNode;
						tempNode = tempNode.next;
					}
				}

			}
		}
	}
}
