package main.demonstration;

import java.util.Stack;

/**
 * This is used to test Java's built in data structures
 * @author hmkrt
 *
 */
public class DemoBuiltInDataStructures {
	
		public static void main(String[] args) {
		
		Stack<Integer> stack2 = new Stack<>();
		
		stack2.set(5, 15);
		
		stack2.add(20);
		stack2.add(1, 150);
		System.out.println(stack2);
		System.out.println("Size = " + stack2.size());

//		for (int i = 1; i <= 10; i++) {
//			stack2.add(i);
//		}
//		System.out.println(stack2 + " " + stack2.size());
//		System.out.println(stack2.pop());
//		System.out.println(stack2 + " " + stack2.size());
//		
//		stack2.remove(3);
//		System.out.println(stack2 + " " + stack2.size());
//		
//		stack2.add(0, 155);
//		System.out.println(stack2 + " " + stack2.size());
//		
//		stack2.add(9, 200);
//		System.out.println(stack2 + " " + stack2.size());
//		
//		stack2.set(0, 1023);
//		System.out.println(stack2 + " " + stack2.size());
//		
//		System.out.println(stack2.get(5));
//		
//		System.out.println(stack2);
		
	}
	
}
