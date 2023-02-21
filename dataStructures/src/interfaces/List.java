package interfaces;

public interface List<T> extends Collection<T> {
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#add(java.lang.Object)
	 */
	public boolean add(T element);
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#remove(java.lang.Object)
	 */
	public boolean remove(T element);
	
	/**
	 * Removes the element at the specified position in the list
	 * @param index
	 * @return the element that was removed from the list
	 */
	public T remove(int index);
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#size()
	 */
	public int size();
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#clear()
	 */
	public void clear();
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#contains(java.lang.Object)
	 */
	public boolean contains(T element);
	
	/*
	 * (non-Javadoc)
	 * @see interfaces.Collection#isEmpty()
	 */
	public boolean isEmpty();
	
	/**
	 * Searches and returns the first occurrence of the index of the specified object in stack
	 * @param Object that should be searched inside the stack
	 * @return The index of the object in the stack. If the object is not present in stack, returns -1 
	 */
	public int indexOf(T object);
	
	/**
	 * Adds an element at a specified position in list
	 * @param index
	 * @param element
	 */
	public void add(int index, T element);
	
	/**
	 * Fetches an element from a particular position in the list 
	 * @param index
	 * @return the element that was set in the list
	 */
	public T get(int index);
	
	/**
	 * Sets an element specified at a particular position in the list to a new value
	 * @param index
	 * @param element
	 * @return the element that was set in the list
	 */
	public T set(int index, T element);
		

}
