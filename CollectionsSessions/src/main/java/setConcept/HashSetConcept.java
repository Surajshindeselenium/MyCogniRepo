package setConcept;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConcept {

	// Set is an interface in java which extends collection interface
	// Set doesn't allow duplicate values
	// Set is unordered collections
	// Set can't be accessed using index

	// HashSet
	// HashSet stores elements by using mechanism called hashing. Which means we
	// cannot access using index
	// HashSet contains unique elements only

	// LinkedHashSet
	// it is similar to HashSet but it maintains insertion order

	// TreeSet
	// It will maintain ascending order

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("LoadRunner");
		hs.add("10");
		hs.add("Tosca");
		hs.add("Tosca");
		hs.add("10");
		

		System.out.println(hs);

		for (String h : hs) {

			System.out.println(h);

		}
		
		System.out.println("*************");
		
		//convert Set into list and print element using indexes 
		
		ArrayList<String> ar = new ArrayList<String>(hs);
		
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
