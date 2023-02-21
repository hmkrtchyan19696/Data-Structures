package linkedlist;

public class LinkedList<T extends Object> {
	
	Node<T> head;
	
	public void append(T data) {
		if (head == null) {
			head = new Node<T>(data);
			return;
		}
		Node<T> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(data);
	}
	
	public void prepend(T data) {
		Node<T> newHead = new Node<T>(data);
		newHead.setNext(head);
		head = newHead;
	}
	
	public void deleteWithValue(T data) {
		if (head == null) {
			return;
		}
		if (head.getData() == data) {
			head = head.getNext();
			return;
		}
		
		Node<T> current = head;
		while (current.getNext() != null) {
			if (current.getNext().getData() == data) {
				current.setNext(current.getNext().getNext());;
				return;
			}
			current = current.getNext();
		}
	}
	
	@Override
	public String toString() {
		Node<T> current = head;
		String vals = "[ ";
		while (current.getNext() != null) {
			vals += current.getData() + " ";
			current = current.getNext();
		}
		return vals + "]";
	}

}
