package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 11:46:34 AM
* project: Corejava
* Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
 * It Takes 3 Operands
 * Syntax: variable = condition ? expr1 : expr2
 *
 * Program to find Max of 2 Numbers
*/

public class Ternarydemo {

	public static void main(String[] args) {
		int a=1110,b=220,max;
		System.out.println("first num "+a);
		System.out.println("first num "+b);
		
		String msg=(a>b)?"a is greatest":"b is greatest";
		System.out.println(msg);
		max=(a>b)?a:b;
		System.out.println("the max of 2 numbers is "+max);
	}

}
