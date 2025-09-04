package arraysdemo;

import java.util.Arrays;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 10:29:40 AM
* project: Corejava
*/

public class Sumavg {

	public static void main(String[] args) {
		 int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
	        int sum=0;
	        float avg=0.00f;

	        //Access Array elements using For each loop
	        for(int i:numbers){
	            sum+=i; //sum array elements
	        }

	        avg=(float)sum/numbers.length;

	        System.out.println("The Array Contents : "+ Arrays.toString(numbers));
	        System.out.println("The Sum of Array Elements : "+sum);
	        System.out.println("The Average of Array Elements : "+avg);
	}

}
