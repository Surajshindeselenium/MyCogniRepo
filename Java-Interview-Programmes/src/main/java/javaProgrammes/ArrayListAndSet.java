package javaProgrammes;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListAndSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(10);
		as.add(10);
		as.add(20);
		as.add(20);
		as.add(30);
		as.add(30);
		
		System.out.println(as.size());
		System.out.println(as);
		
		HashSet<Integer> set = new HashSet<Integer>(as);
		System.out.println(set.size());
		System.out.println(set);
		
		
		
		
	}

}
