package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:07:40 PM
* project: Corejava
* Program to perform Arithmetic Operations using Switch-case
 * Switch statements in Java are control flow structures,
 * that allow you to execute certain block of code based on the value of a single expression
*/

public class Switchdemo2 {

	public static void main(String[] args) {
        int num1,num2,result;
        String operator;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 2 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("Enter Arithmetic Operator");
        operator=scanner.next();
        scanner.close();

        switch (operator){
            case "+":   result=num1+num2;
                        System.out.println("The Addition is : "+result);
                        break;
            case "-":   result=num1-num2;
                        System.out.println("The Subtraction is : "+result);
                        break;
            case "*":   result=num1*num2;
                        System.out.println("The Multiplication is : "+result);
                        break;
            case "/":   result=num1/num2;
                        System.out.println("The Division is : "+result);
                        break;
            default:
                        System.out.println("Invalid Operator");
                        break;

	}

	}
}
