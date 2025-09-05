package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:34:56 PM
* project: Corejava
*/

public class Trading {
	protected double tradeAmount;

	public Trading(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	// Method to be overridden
    public void tradeDetails() {
        System.out.println("General Trading: Amount invested = " + tradeAmount);
    }

    // Profit/Loss calculation (default)
    public double calculateProfitLoss() {
        return 0; // No calculation for general trading
    }
	
}
