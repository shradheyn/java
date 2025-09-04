package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 2:22:12 PM
* project: Corejava
*/

public class Dowhiledemo2 {

	public static void main(String[] args) {
		int i=20;
		do {
			System.out.print(i+"\t");
			i=i+1;
		}while(i<=50);
			System.out.println();
			System.out.println("**********guess name*********");
			String guess;
			Scanner sc=new Scanner(System.in);
			
		do {
			System.out.println("guesss my name");
			guess=sc.next();			
			}while(!"james".equals(guess));
		System.out.println("congrates you guessed the name correctly "+guess);
		sc.close();
		}

}
