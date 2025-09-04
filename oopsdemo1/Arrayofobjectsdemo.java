package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 10:53:13 AM
* project: Corejava
*/
class Faculty{
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
	
}
public class Arrayofobjectsdemo {

	public static void main(String[] args) {
		//create array of faculty object
		Faculty[] obj= new Faculty[5];
		
		//create actual faculty object
		for (int i = 0; i < 5; i++) {
			obj[i]= new Faculty();
		}
		
		//assign data to the objects;
		obj[0].setData(100, "james");
		obj[1].setData(101, "gavin");
		obj[2].setData(102, "navin");
		obj[3].setData(103, "mary");
		obj[4].setData(104, "rod");
		
		//display object data
		System.out.println("***faculty details****");
		for (int i = 0; i < 5; i++) {
			obj[i].showData();
		}
		System.out.println("***********************");
	}

}
