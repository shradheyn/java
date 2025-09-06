package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 10:22:15 AM
* project: Corejava
*/

public class Creditcardpayment implements Payment {
	private String transactionId;
	private boolean paymentSuccess;
	
	public Creditcardpayment() {
		this.transactionId = "TXN" + (int)(Math.random() * 1000000);

	}

	@Override
	public void processPayment(double amount) {
		System.out.println("\nProcessing payment of $" + amount + " via Credit Card");
        // Simulate payment processing
        paymentSuccess = Math.random() > 0.1; // 90% success rate for demo
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Status: " + (paymentSuccess ? "Success" : "Failed"));		
	}

	@Override
	public boolean isPaymentSuccessful() {
		// TODO Auto-generated method stub
		return this.paymentSuccess;
	}

	@Override
	public String getTransactionId() {
		// TODO Auto-generated method stub
		return this.transactionId;
	}
	
	
}
