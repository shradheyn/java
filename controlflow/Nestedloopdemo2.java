package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 4:16:11 PM
* project: Corejava
*/

public class Nestedloopdemo2 {

	public static void main(String[] args) {
		int weeks=3,days=7,i=1;
		while (i<=weeks) {
			System.out.println("week: "+i);
			for (int j = 1; j <= days; j++) {
				System.out.println("\t"+"day :"+j);
			}
			i++;
		}

	}

}
