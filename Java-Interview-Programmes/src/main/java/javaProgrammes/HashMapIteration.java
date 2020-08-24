package javaProgrammes;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	// Write a Java Program to iterate HashMap using While and advance for loop
	public static void main(String[] args) {

		/*
		 * Here we have inserted three elements in HashMap using put() function.
		 * 
		 * The size of the map can get using the size() method. Thereafter, we have used
		 * a While loop for iterating through the map which contains one key-value pair
		 * for each element. Keys and Values can be retrieved through getKey() and
		 * getValue().
		 * 
		 * Likewise, we have used advanced for loop where we have a “me2” object for the
		 * HashMap.
		 */

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Suraj");
		map.put(25, "Shinde");
		map.put(12, "HashMap");
		System.out.println(map.size());
		System.out.println("While Loop:");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		}
		System.out.println("For Loop:");
		for (Map.Entry me2 : map.entrySet()) {
			System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
		}
		System.out.println("*******");
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}

	}
}
