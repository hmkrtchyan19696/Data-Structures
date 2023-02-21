package arraylist;

public class ArrayList {
	
	// ArrayList
		/**
		 * Returns the current capacity of the stack
		 * @return the capacity of the stack (the length of its internal data array)
		 */
		public int capacity() {
			return 0;
		}
		
		//  ArrayList
		/**
		 * Sets the size of the stack to its current number of elements
		 * @return true if the size of the stack has been changed.
		 */
		public boolean trimToSize() {
			return true;
		}
		
//		@Override
//		public boolean trimToSize() {
//			if (isTrimmable()) {
//				Object[] newData = new Object[top+1];
//				
//				for (int i = 0; i <= top; i++) {
//					newData[i] = data[i];
//				}
//				data = newData;
//				return true;
//			}
//			return false;
//		}

}
