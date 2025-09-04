package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 3:27:30 PM
* project: Corejava
* // Program to demonstrate Jump Statements - break & continue


*/

public class Jumpdemo {
	public static void main(String[] args) {
			int i,j;
	        System.out.println("Break Demo"); 
	        for (i=1;i<=25;i++){
	            if(i==15) break; // Terminates the Loop
	            System.out.print(i+"\t");
	        }
	        System.out.println();
	        System.out.println("Continue Demo");
	        for (j=100;j>=75;j--){
	            if(j==90)continue; // Skips the current Iteration in the Loop
	            System.out.print(j+"\t");
	        }
	}
}
