package exceptions;

public class ArrayIndexOutOfBoundsException extends RuntimeException {

	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	public ArrayIndexOutOfBoundsException(String ErrorMessage) {
		super(ErrorMessage);
	}
}
