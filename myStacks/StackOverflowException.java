package myStacks;

public class StackOverflowException extends RuntimeException {
	
	/**
	 * no clue what this does
	 */
	private static final long serialVersionUID = 1L;

	StackOverflowException(String errorMessage) {
		super(errorMessage);
	}
}
