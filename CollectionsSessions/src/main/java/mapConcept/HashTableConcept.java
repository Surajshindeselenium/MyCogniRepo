package mapConcept;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		//HashTable is similar to HashMap, but its Synchronized 
		//stores value on the basis of key and value 
		//key--object--HashCode-->Value
		
		Hashtable h1 = new Hashtable();
		h1.put("Suraj", "Suraj");
		h1.put(1, "Suraj");
		h1.put(2, "Tom");
		h1.put(3, "Peter");
		h1.put(3, "Rahul");//this will override value of key 3 with "Rahul"
	
		
		//no null key---no null value
		//h1.put(null, "Sameer");--this will give null pointer exception
		//h1.put(4, null); ---this will give null pointer exception
		System.out.println(h1);
		
		//creating clone or shallow copy 
		
		Hashtable h2 = new Hashtable();
		
		h2=(Hashtable)h1.clone();//now h2 will have same values as h1
		System.out.println(h1);
		System.out.println(h2);
		
		h2.clear();//to delete all values from h2 object
		
		System.out.println(h1);
		System.out.println(h2);
		
		Hashtable st = new Hashtable();
		st.put("name", "Suraj");
		st.put("age", 28);	
		st.put("Add", "Pune");
		
		
		if(st.contains("Suraj"))//contains(); will check value is available or not 
			System.out.println("Value is found");
		
		//how to iterate hashtable using Enumeration --elements();
		Enumeration em = st.elements();
		
		System.out.println("Printing all values from st");
		
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		//get the value from Key
		
		System.out.println(st.get("name"));
		
		
		//get the Hashcode of hashtable object
		
		System.out.println(st.hashCode());
		
		
		
	}


}
