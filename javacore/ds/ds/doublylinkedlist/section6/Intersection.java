package ds.doublylinkedlist.section6;

/*
 * Intersection
Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
3 -> 1 -> 5 -> 9 -> 7 -> 2 ->1
2-> 4 ->6 -> 7 -> 2 -> 1

//Output =7
 */

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList3 ll1= new SingleLinkedList3();
		SingleLinkedList3 ll2= new SingleLinkedList3();
		ll1.insertSingleLinkedList(3, 0);
		ll1.insertSingleLinkedList(1, 1);
		ll1.insertSingleLinkedList(5, 2);
		ll1.insertSingleLinkedList(9, 3);
		//ll1.traversal();
		ll2.insertSingleLinkedList(2, 0);
		ll2.insertSingleLinkedList(4, 1);
		ll2.insertSingleLinkedList(6, 2);
		addSameNode(ll1,ll2,7);
		addSameNode(ll1,ll2,1);
		addSameNode(ll1,ll2,2);
		ll1.traversal();
		ll2.traversal();
		System.out.println(findIntersect(ll1,ll2).value);
		
		

	}
	
	public static DNode kthNode(DNode head, int k) {
		DNode current = head;
		if(k>0 && current!=null) {
			current=current.next;
			k--;
		}
		return current;
	}
	
	public static DNode findIntersect(SingleLinkedList3 ll1, SingleLinkedList3 ll2) {
		if(ll1.head ==null || ll2.head==null) {
			return null;
		}
		if(ll1.tail!=ll2.tail) {
			return null;
		}else {
			DNode  longest = new DNode();
			DNode shorter= new DNode();
			if(ll1.size>ll2.size) {
				longest=ll1.head;
				shorter=ll2.head;
			}else {
				longest=ll2.head;
				shorter=ll1.head;
			}
			longest= kthNode(longest, Math.abs(ll1.size-ll2.size));
			while(shorter != longest) {
				shorter= shorter.next;
				longest=longest.next;
			}
			return longest;
			
		}
	}
		
		public static void addSameNode(SingleLinkedList3 llA, SingleLinkedList3 llB, int nodeValue) {
		    DNode newNode = new DNode();
		    newNode.value = nodeValue;
		    llA.tail.next = newNode;
		    llA.tail = newNode;
		    llB.tail.next = newNode;
		    llB.tail = newNode;

		  }
	
		
	

}
//Remove the extra node 

