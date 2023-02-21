package exceptions;

public class IllegalArgumentException extends RuntimeException {

	/**
	 * serial version uid
	 */
	private static final long serialVersionUID = 1L;
	
	public IllegalArgumentException(String ErrorMessage) {
		super(ErrorMessage);
	}

}
