package main.demonstration;

import stack.Stack;
import stack.StaticStack;

/**
 * This is class is used to test the implemented data structures
 * @author hmkrt
 *
 */
public class DemoImplementedDataStructures {

	public static void main(String[] args) {
		Stack<Integer> newStaticStack = new StaticStack<>();
		newStaticStack.get(0);
		
		newStaticStack.add(20);
		
		newStaticStack.add(1, 150);
		
		System.out.println(newStaticStack);
		System.out.println("Size = " + newStaticStack.size());
		
		newStaticStack.remove(0);
		System.out.println(newStaticStack);
		newStaticStack.get(1);
//		for (int i = 1; i <= 10; i++) {
//			newStaticStack.add(i);
//		}
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		System.out.println(newStaticStack.pop());
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		
//		newStaticStack.remove(3);
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		
//		newStaticStack.add(0, 155);
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		
//		newStaticStack.add(9, 200);
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		
//		newStaticStack.set(0, 1023);
//		System.out.println(newStaticStack + " " + newStaticStack.size());
//		
//		System.out.println(newStaticStack.get(5));
//		
//		System.out.println(newStaticStack);
		
	}

}
