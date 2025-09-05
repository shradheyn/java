package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 9:48:22 AM
* project: Corejava
*/

public class Upcastingdemo {

	public static void main(String[] args) {
		Product p;
		
		p= new Book("java",450,"james");
		System.out.println("___________book details___________");
		p.display();//dynamic binding 
		
		//Switching from one implementation to another is easy
        p=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        p.display();//Dynamic Binding

        p =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        p.display(); //Dynamic Binding
        Test t1=new Test(100, 200, 45, 600);
        Test2 t2=new Test2(100, 200, 45, 600);
        System.out.println("default variable from test class"+t1.a);
        t2.print();
        

	}

}
