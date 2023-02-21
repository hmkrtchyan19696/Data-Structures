package stack;

/**
 * Dynamic type of Stack, which will allow to add or push items into the stack when its initial capacity is reached
 * @author hmkrt
 * Method descriptions can be found in Stack interface, which this class implements
 * @param <T> can add items of type T only to the stack
 */
public class DynamicStack<T> extends Stack<T>{
	
	private static final int CAPACITY_MULTIPLIER = 2;
	
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int capacity) {
		super(capacity);
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.Stack#push(java.lang.Object)
	 */
	@Override
	public T push(T object) {
		if (isFull()) {
			increaseCapacity();
		}
		return super.push(object);
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.Stack#add(java.lang.Object)
	 */
	@Override
	public boolean add(T object) {
		if (isFull()) {
			increaseCapacity();
		}
		return super.add(object);
	}
	
	/*
	 * (non-Javadoc)
	 * @see stack.Stack#add(int, java.lang.Object)
	 */
	@Override
	public void add(int index, T element) {
		if (isFull()) {
			increaseCapacity();
		}
		super.add(index, element);
	}
	
	/**
	 * Increases the current capacity of the stack so that more items can be added to it
	 */
	private void increaseCapacity() {
		Object[] newData = new Object[(top + 1) * CAPACITY_MULTIPLIER];
		
		for (int i = 0; i <= top; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

}
