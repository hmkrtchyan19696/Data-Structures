package collectionswithListInterface;

public interface MyList<E> {
	
	/**
	 * is used to append an item at the end of the list. Returns true after addition
	 * @return boolean
	 */
	public boolean add(E e);
	
	/**
	 * is used to insert an item at a specified index in the list
	 * @param index
	 */
	public void add(int index, E e);
	
	/**
	 * removes all the items in the list
	 */
	public void clear();

}
