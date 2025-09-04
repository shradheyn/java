package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:26:50 PM
* project: Corejava
* Program to display ur name 10 times & nos from 1-10
*/

public class Whiledemo {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i+".shradhey");
			i++;
		}
		System.out.println("exit loop");
		System.out.println("reverse loop");
		int j=10;
		while(j>=1) {
			System.out.println(j+".shradhey");
			j=j-1;
		}
	}
}
