package cse360assign2;


public class AddingMachine {

	private int total;
	private String operations;
	
	/*
	 *Constructor method for creating an AddinaMachine object. 
	 */
	public AddingMachine () {
		total = 0;  
		operations = "0";
	}
	
	/*
	 * Get method which returns the AddingMachine object value, total.
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * Method which takes an int value as a parameter, and adds that value to it's
	 * AddingMachine object "total" value. Updates "operations" string to show the 
	 * addition operation that was performed. 
	 */
	public void add (int value) {
		total += value;
		String temp = String.valueOf(value);
		operations = operations.concat(" + " + temp);
	}
	
	/*
	 * Method which takes an int value as a parameter, and subtracts that value from
	 * it's AddingMachine object "total" value. Updates "operations" string to show
	 * the subtraction operation that was performed. 
	 */
	public void subtract (int value) {
		total -= value;	
		String temp = String.valueOf(value);
		operations = operations.concat(" - " + temp);
	}
		
	/*
	 * Method that returns the operations that have been performed as one string. 
	 * Does not return the solution. 
	 */
	public String toString () {
		return operations;
	}

	/*
	 * Method clears the values from both AddingMachine object variables, reseting them
	 * back to their default values. 
	 */
	public void clear() {
		operations = "0";
		total = 0;
	}
}
