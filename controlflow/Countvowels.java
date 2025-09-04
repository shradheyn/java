package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 3:05:00 PM
* project: Corejava
* program to count vowels
*/

public class Countvowels {
	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);

     System.out.println("Enter a Sentence : ");
     String s=scanner.nextLine();
     String s2=s.toLowerCase();
     scanner.close();

     int count=0;
     System.out.println("The Length of the String is :" +s2.length());

     for (int i = 0; i <s2.length() ; i++) {
         if(s2.charAt(i) =='a' || s2.charAt(i) =='e' || s2.charAt(i) =='i' ||
                         s2.charAt(i) =='o' || s2.charAt(i) =='u') {
             count=count+1;
             System.out.println("Vowel Found : "+s2.charAt(i));
         }
     }
     System.out.println("Total no. of Vowels in a String : "+count);
	}
}
