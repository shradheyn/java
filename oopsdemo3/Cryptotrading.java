package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:41:24 PM
* project: Corejava
*/

public class Cryptotrading extends Trading{

	public Cryptotrading(double tradeAmount) {
		super(tradeAmount);
	}

	@Override
	public void tradeDetails() {
		 System.out.println("Crypto Trading: Trading digital currencies like Bitcoin, Ethereum.");
	     System.out.println("Amount invested = " + tradeAmount);
	}

	@Override
	public double calculateProfitLoss() {
		 // Assume 20% profit
        return tradeAmount * 0.20;
	}
	
}
