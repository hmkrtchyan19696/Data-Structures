package myStacks;

public class EmptyStackException  extends RuntimeException {

	/**
	 * I have no idea what this is
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyStackException(String errorMessage) {
		super(errorMessage);
	}

}
