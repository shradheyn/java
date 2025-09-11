package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 2:46:34 PM
* project: Corejava
*/

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(111, "john");
		hm.put(222, "jim");
		hm.put(333, "mike");
		hm.put(444, null);
		hm.put(null, "jimmy");
		hm.put(null, "jack");
		
		for (Map.Entry m : hm.entrySet()) {
			 System.out.println(m.getKey()+" "+ m.getValue());
			
		}


	}

}
