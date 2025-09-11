package collectionsdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 4:02:43 PM
* project: Corejava
*/

public class GenericClassDemo {

	public static void main(String[] args) {
		Sample<String> s1= new Sample<String>("java generics");
		
		System.out.println("display from generic class by passing string object: "+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);
		
		System.out.println("display from generic class by passing interger object: "+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(555.50);
		System.out.println("display from genric class by passing double object: "+s3.getData());
	}

}
