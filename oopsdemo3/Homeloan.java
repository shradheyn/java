package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 12:07:58 PM
* project: Corejava
*/

public class Homeloan {
	private String customerName;
    private double loanAmount;
    private final double PROCESSING_FEE;  // final variable (unique per customer, must be initialized once)

    public Homeloan(String customerName, double loanAmount, double pROCESSING_FEE) {
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		PROCESSING_FEE = pROCESSING_FEE;
	}

	public void showLoanDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Processing Fee: " + PROCESSING_FEE);
    }
}
