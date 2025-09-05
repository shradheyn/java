package oopsdemo3;

import javax.swing.text.TableView.TableRow;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:37:18 PM
* project: Corejava
*/

public class Stocktrading extends Trading {

	public Stocktrading(double tradeAmount) {
		super(tradeAmount);
	}

	@Override
	public void tradeDetails() {
		 System.out.println("Stock Trading: Investing in company shares.");
	     System.out.println("Amount invested = " + tradeAmount);
	}

	@Override
	public double calculateProfitLoss() {
		   // Assume 10% profit
        return tradeAmount * 0.10;
	}
	
}
