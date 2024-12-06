package ds.doublylinkedlist.section6;

/*
 * Return Nth to Last
Implement and algorithm to find the nth to last element of a singly linked list.

Example

linkedList = 1->2->3->4-5
deleteDups(linkedList, 2)
//Output
4
 */
public class ReturnNthLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList1 sll = new SingleLinkedList1();
		sll.insertSingleLinkedList(1, 0);
		sll.insertSingleLinkedList(2, 1);
		sll.insertSingleLinkedList(3, 2);
		sll.insertSingleLinkedList(4, 3);
		sll.insertSingleLinkedList(5, 4);
		sll.traversal();
		System.out.println(sll.returnNthLastElement(2));
		

	}

}

class SingleLinkedList1 {
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
	
	//Retrun NthLastElement
	//Time complexity : O(N)
	//Space complexity: O(1)
	public int returnNthLastElement(int n) {
		DNode firstNode=head;
		DNode secondNode=head;
		
		for(int i=0;i<n;i++) {
			firstNode=firstNode.next;
		}
		
		while(firstNode !=null) {
			firstNode=firstNode.next;
			secondNode=secondNode.next;
		}
		return secondNode.value;
		
	}
}