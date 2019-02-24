package cse360assign2;
/**
 * @author      Cole Santana 
 * @classNumber 541              
 * @date        2-19-19         
 */
public class Calculator {
		
		private int total;
		private String history;
	/**
	 * Calculator - constructor for the class, performs 4 different operations
	 * addition, subtraction, multiplication, and division
	 * @param total - set the total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = " 0 ";
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
	 * add - adds the inputed values to the total
	 * 
	 * @param value - integer applied to the function
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * subtract - subtracts the inputed values to the total
	 * 
	 * @param value - integer applied to the function
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * multiply - multiplies the inputed values to the total
	 * 
	 * @param value - integer applied to the function
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * divide - divides the inputed values total
	 * 	
	 * @param value - integer applied to the function
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		total /= value;
		history += " / " + value;
	}
	
	/**
	 * getHistory - prints out the respected functions and the end result
	 * 
	 * @return - String of the operations.
	 */
	public String getHistory () {
		return history;
	}
}
