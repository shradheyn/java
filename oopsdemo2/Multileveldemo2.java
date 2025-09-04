package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 10:25:19 AM
* project: Corejava
*/

public class Multileveldemo2 {

	public static void main(String[] args) {
		Director d1= new Director(101,"KEANE REAVES", 5000);
		
		//Director will have salary+hra+da+ta
        System.out.println("************** Director Details ****************");
        d1.display(); // Staff - Director is a Manager/Staff
        d1.getHRA();  // Staff
        d1.getDA(); //Manager
        d1.getTA(); //Director
        d1.print(); //Director

        Manager m1=new Manager(201,"Mary Kenneth",4000);
        //Manager will have salary+hra+da
        System.out.println("************** Manager Details ****************");
        m1.display(); // Staff -Manager is a Staff
        m1.getHRA();  // Staff
        m1.getDA(); //Manager
        m1.print(); //Manager

       Staff s1=new Staff(301,"Helen Mark",2000) ;
        //Staff will have salary +hra
       System.out.println("************* Staff Details ******************");
       s1.display();
       s1.getHRA();
       s1.printSal();

	}

}
