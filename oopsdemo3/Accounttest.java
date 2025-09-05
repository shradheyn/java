package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:23:53 PM
* project: Corejava
*/

public class Accounttest {

	public static void main(String[] args) {
		Savingsaccount sAccountObj = new Savingsaccount("John", 500, 4);

        System.out.println("\nSavings Account Details");
        System.out.println("------------------------");
        System.out.println("" + sAccountObj.getName()
                + " has an initial Balance of: " + sAccountObj.getBalance());
        sAccountObj.deposit(200);
        sAccountObj.withdraw(300);// invokes base class methods
        System.out.println("" + sAccountObj.getName()
                + " at the end of transaction has a Balance of: "
                + sAccountObj.getBalance());

        System.out.println("\nChecking Account Details");
        System.out.println("------------------------");

        Checkingaccount cAccountObj = new Checkingaccount("Stephen", 500, 200);

        System.out.println("" + cAccountObj.getName()
                + " has an initial Balance of: " + cAccountObj.getBalance());
        cAccountObj.deposit(200);
        //cAccountObj.withdraw(1000); // // invokes overridden method of derived class
        cAccountObj.withdraw(800);
        System.out.println("" + cAccountObj.getName()
                + " at the end of transaction has a Balance of: "
                + cAccountObj.getBalance());

	}

}
