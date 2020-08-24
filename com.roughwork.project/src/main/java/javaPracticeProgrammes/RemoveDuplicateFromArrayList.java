package javaPracticeProgrammes;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);

		System.out.println(al.size());
		
		ArrayList<Integer> ar= removeDuplicates(al);
		
		System.out.println(ar);

	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		
		ArrayList<Integer> ob = new ArrayList<Integer>();
		
		for (Integer in : list) {

			

			if (!ob.contains(in)) {
				ob.add(in);
			}

		}
		
		return ob;
	}

}
