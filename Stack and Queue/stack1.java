package Stack and Queue;

import java.util.*;

public class stack1 {
	public static void main(String [] args) {
		Stack<Integer> stack = new Stack<>();
		
		// Insert the values to the Stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		// To return top most element without deleting 
		int top = stack.peek();
		System.out.println("Topmost element in stack: " + top);
		
		// To remove the top most element in stack 
		stack.pop();
		System.out.println("One element is popped!");
		
		
		// To check the stack is empty or not - returns boolean value
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack is not Empty");
		}
		
		// To return the size of stack 
		int size = stack.size();
		System.out.println("Stack size is: " + size);
		
		//To search the object in the stack - return value in 1 based position 
		// Return -1 if not contains
		int position = stack.search(20);
		System.out.println("The position of 20 is: " + position);
		
		// To check the value present in stack - return boolean value
		if(stack.contains(30)) {
			System.out.println("The stack contains 30");
		} else {
			System.out.println("The stack does not contains 30");
		}
		
		// Traverse the stack using iterator
		Iterator<Integer> it = stack.iterator();
		System.out.println("Stack elements using iterator: ");
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		//Traverse the stack using for-each loop
		System.out.println("Stack elements using for-each loop: ");
		for(int i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// To empty the stack 
		stack.clear();
		// Checking it again 
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack is not Empty");
		}	
	}
}
