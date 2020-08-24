package sortingConcept;

import java.util.ArrayList;

public class ItrateList {
	
	public static <T> void itrateList(ArrayList<T> myList) {
		for (T list : myList) {
			System.out.println(list);
		}
	}

}
