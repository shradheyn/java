package basics;

/**
* author: Shradhey.Naudiyal
* date: Aug 30, 2025
* time: 11:44:21 AM
* project: Corejava
* Program to Calculate Simple Interest for a Loan Amount
*/
import java.util.*;
public class Simpleinterest {

	public static void main(String[] args) {
		String customerName;
		double principal;
		float si;
		int term,rate;
		
		///Create scanner object for taking input at runtime
		Scanner scan = new Scanner(System.in);
		
		//Input
		System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
		System.out.println("Enter Customer Name : ");
		customerName=scan.nextLine();//Multiple words input
		System.out.println("Enter Loan Amount   : ");
		principal=scan.nextDouble();
		System.out.println("Enter Loan Term     : ");
		term=scan.nextInt();
		System.out.println("Enter Rate of Interest :");
		rate=scan.nextInt();
		
		//Calculate Simple Interest
		si=(float) (principal*term*rate)/100;
		
		//Output
		System.out.println("************ Loan Details ************************");
		System.out.println("Customer Name           : "+customerName);
		System.out.println("Principal Amount        : "+principal);
		System.out.println("Term                    : "+term);
		System.out.println("Rate of Interest        : "+rate);
		System.out.println("--------------------------------------------------");
		System.out.println("Simple Interest         : "+si);
		System.out.println("--------------------------------------------------");
		
		scan.close();

	}

}
