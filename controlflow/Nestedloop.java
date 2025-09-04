package controlflow;

import java.util.Iterator;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 4:08:58 PM
* project: Corejava
*/

public class Nestedloop {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
