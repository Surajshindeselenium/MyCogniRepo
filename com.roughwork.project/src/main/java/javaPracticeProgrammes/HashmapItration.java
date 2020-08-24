package javaPracticeProgrammes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapItration {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "Load Runner");
		hm.put(3, "Jmeter");

		System.out.println(hm.size());

		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		}
		
		System.out.println("Using for loop");
		
		for(Map.Entry me2: hm.entrySet()) {
			
			System.out.println("Keys is"+me2.getKey()+"Value is"+me2.getValue());
			
		}

	}

}
