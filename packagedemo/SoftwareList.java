package packagedemo;

import com.coforge.training.oracleproj.Database;
import com.coforge.training.oracleproj.OperatingSystem;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 10:38:51 AM
* project: Corejava
*/

public class SoftwareList {
	public static void main(String[] args) {
		OperatingSystem op1= new OperatingSystem();
		Database d1= new Database();
		
		System.out.println("*********list of operating system from microsoft********");
		op1.listSoftware();
		System.out.println("____________________________________________");
		
		System.out.println("*****list of databases from oracle***********");
		d1.printSoftware();
	}
}
