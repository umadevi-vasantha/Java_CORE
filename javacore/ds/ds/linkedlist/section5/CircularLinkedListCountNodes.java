package ds.linkedlist.section5;

public class CircularLinkedListCountNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSLinkedList cll= new CSLinkedList();
		cll.append(10);
		cll.append(14);
		cll.append(15);
		cll.append(19);
		cll.append(10);
		System.out.println(cll.countNodes());
	}

}
class CSLinkedList {
    Node head;
    Node tail;
    int length;

    public CSLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // Other methods...

    // Method to append a node at the end of the list
    public void append(int value) {
        Node newNode = new Node();
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

    // Method to convert the list into a string representation
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

    public int countNodes() {
        int count = 0;
        Node temp = this.head;
        if (temp == null) {
            return 0;  // Return 0 immediately if the list is empty
        }

        do {
            count++;  // Increment the count for each node
            temp = temp.next;  // Move to the next node
        } while (temp != this.head);  // Continue until the list cycles back to the head

        return count;  // Return the total count
    }
}
