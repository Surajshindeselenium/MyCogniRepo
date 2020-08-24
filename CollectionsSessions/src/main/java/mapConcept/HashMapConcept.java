package mapConcept;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map interface
		//Extends AbstractMap
		//it contains only unique elements 
		//Stores the values --key -- value pair
		//it may have one null key and multiple null values 
		//it maintains no order
		//HashMap is non synchronized 
		
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(15, "LoadRunner");
		hm.put(35, "RFT");
		hm.put(56, "QTP");
		hm.put(null,"Suraj");
		hm.put(22, null);
		hm.put(1, "Selenium");
		
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.get(5));//This will print 'null' not ArrayIndexOutOfBond because HashMap does not store values on basis of indexes 
		System.out.println("*******");
		for(Entry m: hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(3);//o/p: {1= Selenium, 2=QTP, 4=RFT} here it will remove value from key 3 and will not shift 4th value at 3rd position
		System.out.println(hm);
		
		//Storing Employee objects in HashMap
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 35, "IT");
		Employee e2 = new Employee("Peter", 30, "Comp");
		Employee e3 = new Employee("Chris", 25, "Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse Hashmap
		
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key+" "+"Info");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		
		HashMap<String, String> hmm = new HashMap<String, String>();
		hmm.put("Suraj", "Suraj");
		System.out.println(hmm);
		
		
		
	}

}
