package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 9:46:31 AM
* project: Corejava
*/

public class Insufficientfundsexception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	public Insufficientfundsexception(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
