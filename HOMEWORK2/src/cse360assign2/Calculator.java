package cse360assign2;
/**
 * @author      Cole Santana 
 * @classNumber 541              
 * @date        2-19-19         
 */
public class Calculator {
		
		private int total;
	/**
	 * Calculator - constructor for the class
	 * 
	 * @param total - set the total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - returns the final total of the calculation
	 * 
	 * @return - result of all the operations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - adds the inputed values
	 * 
	 * @param value - integer applied to the function
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract - subtracts the inputed values
	 * 
	 * @param value - integer applied to the function
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply - multiplies the inputed values
	 * 
	 * @param value - integer applied to the function
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide - divides the inputed values
	 * 	
	 * @param value - integer applied to the function
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		total /= value;
	}
	
	/**
	 * getHistory - prints out the respected functions and the end result
	 * 
	 * @return - String of the operations.
	 */
	public String getHistory () {
		return "";
	}
}
