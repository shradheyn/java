package collectionsdemo;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 9:32:00 AM
* project: Corejava
*/

public class TwoPairDemo {
	public static void main(String[] args) {
		
		Pair<String,Integer > p1=new Pair<>("the car guys",8);
		Scanner sc=new Scanner(System.in);
		System.out.println("our current rating for "+p1.getFirst()+" is: "+p1.getSecond());
		
		System.out.println("how would u rate them?");
		int score=sc.nextInt();
		
		p1.setSecond(score);
		
		System.out.println("our new rating for "+p1.getFirst()+" is: "+p1.getSecond());
		
		Pair<String,Float> p2=new Pair<String,Float>("TROY",8.5f);
		
		
		System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		
		System.out.println("How would you rate them ?:");
		float score1 =sc.nextFloat();
		
		p2.setSecond(score1);
		sc.close();
		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
	}

}
