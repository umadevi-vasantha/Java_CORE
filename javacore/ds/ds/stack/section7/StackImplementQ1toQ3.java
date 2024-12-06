package ds.stack.section7;

/*
 * Implement Stack
Implement a Stack class. 
The class should be initialized with a given value which would be the value of the first node in the stack. 
Specifications: Inner Node Class: Attributes: 
value: An integer that stores the value of the node. 
next: A Node type that points to the next node in the stack.

Stack class: Should accept an integer value to initialize the value attribute. 
Stack Class: 
Attributes: 
top: A private Node type that points to the top node of the stack. 
height: A private integer that keeps track of the number of elements in the stack. 
Constructor: Accepts an integer value as the initial value for the stack. Initializes the top with a new Node containing the given value. Sets the height to 1.
 * 
 */

/*
 * Push Method
Develop a method named push to place a new node with a specified value at the peak of the stack.
Return type: void
The method should complete these steps:
Receive a numerical value (integer) which is assigned to the new node.
Generate a new Node entity named addedNode using the specified value.
In case the stack's length is 0, adjust the peak reference to the addedNode.
For stacks with a depth exceeding 0, execute these steps:
a. Direct the next reference of the addedNode towards the current peak node.
b. Modify the peak reference to indicate the addedNode.
Augment the length value of the stack by one unit.
 */


/*
 * Pop Method
Develop a method named pop for a stack that executes the following:

When the stack is empty (height is 0), it should return null.

Capture the topmost node of the stack in a variable named temp.

Reassign the stack's top to the second node in the stack.

Detach the temp node from the stack by setting its next attribute to null.

Decrease the stack's height by one.

Finally, return the temp node, which is the node that was removed from the stack.

Expected Output: The method should return a Node type, specifically the one that was last popped from the stack.    Firstly, let's define a basic Node class:
 */
public class StackImplementQ1toQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 stack= new Stack2(8);
		System.out.println(stack.top.value);
		System.out.println(stack.height);
		stack.push(9);
		System.out.println(stack.top.value);
		System.out.println(stack.height);
		stack.pop();
		System.out.println(stack.top.value);
		System.out.println(stack.height);
		

	}

}


class Stack2{
	SNode top;
	int height;
	
	public Stack2(int value) {
		this.top=new SNode(value);
		this.height=1;
		
	}
	
	//push
	public void push(int value) {
		SNode addedNode;
		if(this.height==0) {
			addedNode=new SNode(value);
			this.top=addedNode;
			System.out.println("Stack created");
		}else {
			SNode temp=this.top;
			addedNode=new SNode(value);
			addedNode.next=temp;
			this.top=addedNode;
			this.height++;
			System.out.println("Element added in stack");
			
			
		}
	}
		
		//Pop 
		public SNode pop() {
			SNode temp = this.top;
			if(this.height==0) {
				System.out.println("Stack is empty");
			}else {
				this.top=temp.next;
				temp.next=null;
				this.height--;
			}
			return temp;
		}
	}

class SNode{
	int value;
	SNode next;
	
	public SNode(int value) {
		this.value=value;
		this.next=null;
				}
}