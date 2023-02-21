package myStacks;

/**
 * @author hmkrt
 * Dynamic stack of integers
 */
public class StackIntDynamic extends myStack {
	
	private static final int CAPACITY_MULTIPLIER = 2;
	
	public StackIntDynamic() {
		super();
	}
	
	public StackIntDynamic(int capacity) {
		super(capacity);
	}
	
	/**
	 * Pushes a value at the top of the stack
	 * If the stack reaches its capacity, the capacity will be automatically increased
	 * @param Value that is to be inserted in stack
	 * @return The value that was added to the stack
	 */
	@Override
	public int push(int value) {
		if (isFull()) {
			increaseCapacity();
		}
		data[++top] = value;
		return value;
	}
	
	/**
	 * Adds a value to the top of the stack
	 * If the stack reaches its capacity, the capacity will be automatically increased
	 * @param Value that is to be inserted in stack
	 * @return True after adding the value to the stack
	 */
	@Override
	public boolean add(int value) {
		if (isFull()) {
			increaseCapacity();
		}
		data[++top] = value;
		return true;
	}
	
	/**
	 * Doubles the current capacity of the stack
	 */
	private void increaseCapacity() {
		int[] newData = new int[(top + 1) * CAPACITY_MULTIPLIER];
		
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

}
