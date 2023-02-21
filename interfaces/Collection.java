package interfaces;

/**
 * In reality, this interface should extend the iterable interface, but currently I don't know yet how to implement iterable interface
 * @author hmkrt
 * 
 * @param <T> that extends the Object
 */
public interface Collection<T extends Object> {
	
	/**
	 * Inserts an object to the end of the collection
	 * @param element
	 * @return true when the collection has been changed as a result of inserting the object
	 */
	public boolean add(T element);
	
	/**
	 * Removes the first occurrence of the specified element in the collection
	 * @param element
	 * @return true when the collection has been changed as a result of removing the object
	 */
	public boolean remove(T element);
	
	/**
	 * Returns the size of the collection
	 * @return the number of elements in the collection
	 */
	public int size();
	
	/**
	 * Removes all the elements in the collection
	 */
	public void clear();
	
	/**
	 * Checks whether the specified element is present inside the collection
	 * @param element
	 * @return true if the element is present in the collection
	 */
	public boolean contains(T element);
	
	/**
	 * Checks whether the collection doesn't contain any elements
	 * @return true if the collection is empty
	 */
	public boolean isEmpty();

}
