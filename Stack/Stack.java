/*
 * Stack follows LIFO: Last In First Out
 */

package DataStructure;

public class Stack {
	// Create Stack
	int size = 3;
	int top = -1;
	int[] stack = new int[size];
	
	 // Elements adding method
	 void push(int x) {
		if(top < size-1) {
			top += 1;
			stack[top] = x;
			System.out.println("Element added: "+x);
		}
		else {
			System.out.println("Ops! There is no space.");
		}
	}
	
	// Element deleting method from top
	void pop() {
		if(top >= 0) {
			int value = stack[top];
			top -= 1;
			System.out.println("Element removed: "+value);
		}
		else {
			System.out.println("Ops! Empty Stack.");
		}
	}
	
	// Showing Elements from top
	void peek() {
		if(top >= 0) {
			System.out.println("Top Element: "+stack[top]);
		}
		else {
			System.out.println("Ops! Empty Stack.");
		}
	}
	
	/////////////// Main Function
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(40);
		stack.push(20);
		stack.push(90);
		stack.push(50);
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.peek();
	}
}
