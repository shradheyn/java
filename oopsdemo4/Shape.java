package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 9:54:47 AM
* project: Corejava
*/

public interface Shape {
	 //implicitly public, static and final
    public String LABEL="Shape";
     
    //interface methods are implicitly abstract and public
    void draw();
     
   public abstract double getArea();
}
