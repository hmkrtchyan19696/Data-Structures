package linkedlist;

public class Node<T extends Object> {
	
	private Node<T> next;
	private T data;
	
	public Node() {
		
	}
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext() {
		next = new Node<T>();
	}
	
	public void setNext(T data) {
		next = new Node<T>(data);
	}
	
	public void setNext(Node<T> newNode) {
		if (newNode != null) {
			next = newNode;			
		}
		return;
	}

}
