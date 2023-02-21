package myStacks;

/**
 * @author hmkrt
 * provides an abstraction for both static and dynamic stacks
 */
public abstract class myStack {
	
	protected int[] data;
	protected int top = -1; // the index of the stack
	
	public myStack() {
		data = new int[10];
	}
	
	public myStack(int capacity) {
		data = new int[capacity];
	}
	
	/**
	 * Pushes a value to the top of the stack
	 * @param Value that is to be inserted in stack
	 * @return The value that was added to the stack
	 */
	public abstract int push(int value);
	
	/**
	 * Adds a value to the top of the stack
	 * @param Value that is to be inserted in stack
	 * @return True after adding the value to the stack
	 */
	public abstract boolean add(int value);
	
	/**
	 * Checks whether the stack is full
	 * @return True if the stack is full and false otherwise
	 */
	public boolean isFull() {
		return top == data.length - 1;
	}
	
	/**
	 * Checks whether the stack is empty
	 * @return True if the stack is empty and false otherwise
	 */
	public boolean empty() {
		return top == -1;
	}
	
	/**
	 * Removes the value at the top of the stack
	 * @return The value at the top of the stack. If the stack is empty the method will return -1
	 */
	public int pop() throws EmptyStackException {
		if (empty()) {
			throw new EmptyStackException("The Stack is empty");
		}
		return data[top--];
	}
	
	/**
	 * Returns but does not remove the value at the top of the stack
	 * @return Value at the top of the stack
	 */
	public int peek() {
		return data[top];
	}
	
	/**
	 * Searches and returns the first occurrence of the index of the specified integer in stack
	 * @param Value that should be searched inside the stack
	 * @return The index of the integer in the stack. If the item is not present in stack, returns -1 
	 */
	public int search(int value) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Sets the capacity of the stack to its current number of values
	 */
	public void trim() {
		int[] newData = new int[top + 1];
		
		for (int i = 0; i < top + 1; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
	
	@Override
	public String toString() {
		if (empty()) {
			return "[]";
		}
		String values = "[";
		for (int i = 0; i < top; i++) {
			values += Integer.toString(data[i]) + ", ";
		}
		values += Integer.toString(data[top]) + "]";
		return values;
	}

}
