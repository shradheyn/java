package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 2:36:14 PM
* project: Corejava
*/

public class Arraystest {
	public static void main(String[] args) {
		/* Java program for General Exception Handling */


		String[] languages = {"C","C++","Java","Perl","Python"};

		        try {
		            for (int i = 0; i <= languages.length; i++) {
		            System.out.println(languages[i]);
		                }
		            }
		        catch (Exception e){
		            e.printStackTrace();
		        }
		        finally {
		            System.out.println("In Finally Block");
		        }
	}
}
