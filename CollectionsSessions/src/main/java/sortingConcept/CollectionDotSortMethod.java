package sortingConcept;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDotSortMethod {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(30);
		integerList.add(7);
		integerList.add(8);
		integerList.add(13);
		integerList.add(1);
		integerList.add(9);
		integerList.add(30);

		ItrateList.itrateList(integerList);
		System.out.println("After sorting using Collections.sort() method");

		Collections.sort(integerList);
		

		ItrateList.itrateList(integerList);

		// Sorting String List

		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Inception");
		movies.add("Avtar");
		movies.add("Shawshang Redumption");
		movies.add("Thor");
		movies.add("Girl next door");

		ItrateList.itrateList(movies);

		System.out.println("After sorting using Collections.sort() method");

		Collections.sort(movies);

		ItrateList.itrateList(movies);

	}

	

}
