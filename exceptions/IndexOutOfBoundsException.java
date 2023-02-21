package exceptions;

public class IndexOutOfBoundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public IndexOutOfBoundsException(String errorMessage) {
		super(errorMessage);
	}

}
