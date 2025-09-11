package miscellaneous.banking;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 4:38:55 PM
* project: Corejava
*/

public class BankingUtil {
	// Generic method to print any type of transaction
    public static <T> void printTransaction(T transaction) {
        System.out.println("Transaction: " + transaction);
    }
    

}
