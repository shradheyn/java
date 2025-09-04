package basics;
/**
 * calculate the area of a circle
 * it demonstrates the use of variables,arithemetic operations, and console output in java.
 * 
 */
public class Area {

	public static void main(String[] args) {
		double radius=7.5;
		double area;
		final double PI=3.14159;
		
		area= PI* radius * radius;
		System.out.println("the area of the circle with radius" +radius+" is:"+area);

	}

}
