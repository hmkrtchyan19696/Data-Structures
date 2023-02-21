package stack;

import exceptions.StackOverflowException;

/**
 * Static type of Stack, which will not allow to push items in stack if the stack is already full
 * @author hmkrt
 * Method descriptions can be found in Stack interface, which this class implements
 * @param <T> can add items of type T only to the stack
 */
public class StaticStack<T> extends Stack<T> {
	
	public StaticStack() {
		super();
	}
	
	public StaticStack(int capacity) {
		super(capacity);
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.Stack#push(java.lang.Object)
	 */
	@Override
	public T push(T object) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is full. You cannot add any more items to the stack.");
		}
		return super.push(object);
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.Stack#add(java.lang.Object)
	 */
	@Override
	public boolean add(T object) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is full. You cannot add any more items to the stack.");
		}
		return super.add(object);
	}

	@Override
	public void add(int index, T element) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is full. You cannot add any more items to the stack.");
		}
		super.add(index, element); 		
	}

}
