package linkedlist;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> integers = new LinkedList<>();
		
		for (int i = 1; i <= 10; i++) {
			integers.append(null);
		}
		
		
		
		System.out.println(integers);
	}

}
