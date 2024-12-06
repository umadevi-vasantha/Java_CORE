package ds.doublylinkedlist.section6;

/*
 * Sum Lists
You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

list1 = 7 -> 1 -> 6
list2 =  5 -> 9 -> 2
result = 2 -> 1 -> 9
 */
public class SumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList3 ll1 =new SingleLinkedList3();
		ll1.insertSingleLinkedList(7, 0);
		ll1.insertSingleLinkedList(1, 1);
		ll1.insertSingleLinkedList(6, 2);
		ll1.traversal();
		SingleLinkedList3 ll2 =new SingleLinkedList3();
		ll2.insertSingleLinkedList(5, 0);
		ll2.insertSingleLinkedList(9, 1);
		ll2.insertSingleLinkedList(2, 2);
		ll2.traversal();
		Questions q= new Questions();
		SingleLinkedList3 ll3=q.sumList(ll1, ll2);
		ll3.traversal();
		
		
		;
		

	}

}

class SingleLinkedList3 {
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
	
	
	
}

class Questions{
	//SumList
		public SingleLinkedList3 sumList(SingleLinkedList3 ll1, SingleLinkedList3 ll2) {
			SingleLinkedList3 ll3= new SingleLinkedList3();
			DNode node1= ll1.head;
			DNode node2= ll2.head;
			int carry=0;
			//for(int i=0; i<ll1.size;i++) 
			int i=0;
			while(node1 !=null && node2 !=null){
				int sum=node1.value+node2.value+carry;
				int value=sum%10;
				carry=sum/10;
				ll3.insertSingleLinkedList(value, i);
				node1=node1.next;
				node2=node2.next;
				i++;
				
			}
			return ll3;
			
		}
}