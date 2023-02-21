package demo;

import myStacks.StackIntDynamic;
import myStacks.StackIntStatic;
import myStacks.myStack;

public class Demo {

	public static void main(String[] args) {
		/*
		 * implementation of static stack
		 */
		myStack staticStack = new StackIntStatic();
		System.out.println("Initializing static stack");
		System.out.printf("My stack contents: %s\n",staticStack.toString());
		System.out.printf("Is stack empty ? %b\n", staticStack.empty());
		System.out.printf("Is stack full ? %b\n", staticStack.isFull());
		
		/*
		 * adding integers 1 - 10 to the stack
		 * NOTE - will throw an exception (StackOverflowException) if we try to add more than 10 items to the stack
		 */
		System.out.println("Adding integers 1 - 10 to the stack");
		for (int i = 1; i < 11; i++) {
			staticStack.push(i);
		}
		
		System.out.printf("My stack contents: %s\n",staticStack.toString());
		System.out.printf("Is stack full ? %b\n", staticStack.isFull());
		System.out.printf("Item at the top of the stack: %d\n", staticStack.peek());
		
		System.out.printf("Index of value %d is %d\n", 5, staticStack.search(5));
		
		/*
		 * removing 10 items from the stack
		 * NOTE - will throw an exception (EmptyStackException) if we try to pop an item after the stack becomes empty
		 */
		System.out.println("Removing the ten items from the stack");
		for (int i = 0; i < 10; i ++) {
			staticStack.pop();
		}
		
		System.out.printf("My stack contents: %s\n",staticStack.toString());
		System.out.printf("Is stack empty ? %b\n", staticStack.empty());
		
		System.out.println();
		/*
		 * implementation of dynamic stack
		 */
		myStack dynamicStack = new StackIntDynamic();
		System.out.println("Initializing dynamic stack");
		System.out.printf("My stack contents: %s\n",staticStack.toString());
		System.out.printf("Is stack empty ? %b\n", dynamicStack.empty());
		System.out.printf("Is stack full ? %b\n", dynamicStack.isFull());
		
		/*
		 * adding integers 1 - 30 to the stack
		 * NOTE - will not throw if we try to add more than the default capacity of 10 items
		 */
		System.out.println("Adding integers 1 - 10 to the stack");
		for (int i = 1; i < 11; i++) {
			dynamicStack.push(i);
		}
		System.out.printf("Is stack full ? %b\n", dynamicStack.isFull());
		
		for (int i = 11; i < 31; i++) {
			dynamicStack.push(i);
		}
		
		dynamicStack.trim();
		dynamicStack.add(125); // checking add after trim
		
		System.out.printf("My stack contents: %s\n",dynamicStack.toString());
		System.out.printf("Item at the top of the stack: %d\n", dynamicStack.peek());
		
		System.out.printf("Index of value %d is %d\n",25,dynamicStack.search(25));
		
		/*
		 * removing 10 items from the stack
		 */
		System.out.println("Removing ten items from the stack");
		for (int i = 0; i < 10; i ++) {
			dynamicStack.pop();
		}
		
		System.out.printf("My stack contents: %s\n",dynamicStack.toString());
		System.out.printf("Is stack empty ? %b\n", dynamicStack.empty());
		
		/*
		 * removing the remaining items from stack
		 * NOTE - will throw an exception (EmptyStackException) if we try to pop an item after the stack becomes empty
		 */
		System.out.println("Removing rest of the items from the stack");
		for (int i = 0; i < 21; i ++) {
			dynamicStack.pop();
		}
		System.out.printf("My stack contents: %s\n",dynamicStack.toString());
		System.out.printf("Is stack empty ? %b\n", dynamicStack.empty());

	}

}
