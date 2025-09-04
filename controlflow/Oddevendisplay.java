package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:51:04 PM
* project: Corejava
*  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
*/

public class Oddevendisplay {

	public static void main(String[] args) {
		int i=1;
		System.out.println("odd \t even");
		System.out.println("--- \t ---");
		while(i<=10) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}else {
				System.out.println(i);
			}
			i++;
		}

	}

}
