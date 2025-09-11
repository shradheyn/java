package collectionsdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 4:10:59 PM
* project: Corejava
*/

public class GenericMethodsDemo {
	public static<E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array


	}

}
