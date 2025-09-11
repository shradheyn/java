package collectionsdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 4:18:07 PM
* project: Corejava
* //Syntax: <type-parameter> return_type method_name (parameters) {...}
*/

public class GenericMethodDemo2 {

	<T> void show(T a) {
		System.out.println("the generic value is: "+a);
	}
	
	<V,T> void hello(V a,T b) {
		System.out.println(a.getClass().getName()+" = "+a+" ");
		System.out.println(b.getClass().getName()+" = "+b+" ");
	}
	public static void main(String[] args) {

		GenericMethodDemo2 gd=new GenericMethodDemo2();
		
		gd.show(100);
		gd.show(1000.50);
		gd.show("Generics in Java");
		gd.show('A');
		gd.show(true);
		gd.show(10.0f);
		gd.show(10L);
		
		System.out.println();
		
		gd.hello(101, "James Gosling");
		gd.hello("Rod Jhonson","Spring");
		gd.hello("Java", 8);
		gd.hello(120, 200.50);
	}

}
