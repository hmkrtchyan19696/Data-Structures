package myStacks;

/**
 * @author hmkrt
 * Static stack of integers
 */
public class StackIntStatic extends myStack {
	
	public StackIntStatic() {
		super();
	}
	
	public StackIntStatic(int capacity) {
		super(capacity);
	}
	
	/**
	 * Pushes values into the stack. 
	 * Will throw StackOverflowException if the capacity of the stack is reached.
	 */
	@Override
	public int push(int value) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is full");
		}
		data[++top] = value;
		return value;
	}
	
	/**
	 * Adds values into the stack. 
	 * Will throw StackOverflowException if the capacity of the stack is reached.
	 */
	@Override
	public boolean add(int value) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is full");
		}
		data[++top] = value;
		return true;
	}

}
