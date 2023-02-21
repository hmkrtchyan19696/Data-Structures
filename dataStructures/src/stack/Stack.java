package stack;

import exceptions.EmptyStackException;
import exceptions.IndexOutOfBoundsException;
import interfaces.List;

public abstract class Stack<T> implements List<T> {
	
	protected final int DEFAULT_CAPACITY = 10;
	protected Object[] data;
	protected int top = -1;
	
	public Stack() {
		data = new Object[DEFAULT_CAPACITY];
	}
	
	public Stack(int capacity) throws IllegalArgumentException {
		if (capacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		}
		else if (capacity == 0) {
			data = new Object[DEFAULT_CAPACITY];
		}
		data = new Object[capacity];
	}
	
	/**
	 * Pushes an object to the top of the stack
	 * @param Object that should be pushed to the top of the stack
	 * @return The object that was pushed to the stack 
	 */
	public T push(T object) {
		data[++top] = object;
		return object;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#add(java.lang.Object)
	 */
	@Override
	public boolean add(T object) {
		data[++top] = object;
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#add(int, java.lang.Object)
	 */
	@Override
	public void add(int index, T element) {
		validateIndex(index, "add");
		Object[] newData = updateData("add", index, element, new Object[data.length]);
		
		data = newData;
		top++;
	}
		
	/**
	 * Pops the object that was at the top of the stack
	 * @return The object that was at the top of the stack
	 */
	@SuppressWarnings("unchecked")
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("The Stack is empty. You cannot pop items from stack.");
		}
		return (T) data[top--];
	}
	
	/**
	 * Checks whether the stack is full
	 * @return True if the stack is full and false otherwise
	 */
	public boolean isFull() {
		return top == data.length - 1;
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.List#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * Returns but does not remove the object at the top of the stack
	 * @return Object at the top of the stack
	 */
	@SuppressWarnings("unchecked")
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException("The stack is empty.");
		}
		return (T) data[top];
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(T object) {
		for (int i = 0; i <= top; i++) {
			if (data[i].equals(object)) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		String values = "[";
		for (int i = 0; i < top; i++) {
			values += data[i] + ", ";
		}
		values += data[top] + "]";
		return values;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(T object) {
		for (int i = 0; i <= top; i++) {
			if (data[i].equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#size()
	 */
	@Override
	public int size() {
		return top + 1;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#clear()
	 */
	@Override
	public void clear() {
		top = -1;
		return;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(T element) {
		if (!isEmpty()) {
			int indexOfElement = indexOf(element);
			Object[] newData = updateData("Remove", indexOfElement, element, new Object[data.length]);
			
			data = newData;
			top--;
			return true;
		}
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#remove(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		validateIndex(index, "");
		if (!isEmpty()) {
			Object[] newData = updateData("remove", index, null, new Object[data.length]);
			
			Object removedElement = data[index];
			data = newData;
			top--;
			return (T) removedElement;
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#get(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		validateIndex(index, "");
		return (T) data[index];
	}
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.List#set(int, java.lang.Object)
	 */
	@Override
	public T set(int index, T element) {
		validateIndex(index, "");
		data[index] = element;
		return element;
	}
	
	/**
	 * Returns the capacity of the stack
	 * @return capacity of the stack
	 */
	public int capacity() {
		return data.length;
	}
	
	/**
	 * Checks whether the given index is within or out of bounds of the internal array.
	 * If the operation type is addition, then we have to check an additional index after the top of the stack, 
	 * because we can add items after the top element of the stack.
	 * @param index
	 * @throws IndexOutOfBoundsException
	 */
	protected void validateIndex(int index, String operationType) throws IndexOutOfBoundsException {
		if (operationType.equals("add")) {
			if (index > top + 1 || index < 0) {
				throw new IndexOutOfBoundsException(String.format("%s > %s", index, top + 1));
			}
			return;
		}
		if (index > top || index < 0) {
			throw new IndexOutOfBoundsException(String.format("The index %s is out of bounds for the stack size of %s", index, top + 1));
		}	
	}
	
	/**
	 * Updates the underlying array of elements based on the fact
	 * whether we want to add or remove an element from the stack.
	 * @param type
	 * @param index
	 * @param element
	 * @param newData
	 * @return new updated version of the Object array.
	 */
	protected Object[] updateData(String operationType, int index, T element, Object[] newData) {
		if (operationType.equalsIgnoreCase("ADD")) {
			for (int i = 0; i < index; i++) {
				newData[i] = data[i];
			}
			newData[index] = element;
			for (int i = index + 1; i <= top + 1; i++) {
				newData[i] = data[i-1];
			}
			return newData;
		}
		for (int i = 0; i < index; i++) {
			newData[i] = data[i];
		}
		for (int i = index + 1; i <= top; i++) {
			newData[i-1] = data[i];
		}
		return newData;
	}
		
}
