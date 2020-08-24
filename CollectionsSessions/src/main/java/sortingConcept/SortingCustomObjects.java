package sortingConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCustomObjects {
	
	public static void main(String[] args) {
		
		MoviesDetailsClass inception = new MoviesDetailsClass("Inception","Leonardo","Director1",9.5);
		MoviesDetailsClass avtar = new MoviesDetailsClass("Avtar","Unknown1","Director2",8.9);
		MoviesDetailsClass shwoshangRedumtion = new MoviesDetailsClass("Shwoshang Redumtion","Leonardo","Director3",9.1);
		MoviesDetailsClass girlNextDoor = new MoviesDetailsClass("Girl Next Door","Unknown2","Director4",8.3);
		MoviesDetailsClass thor = new MoviesDetailsClass("Thor","Unknown3","Director5",8.2);
		
		ArrayList<MoviesDetailsClass> movies = new ArrayList<MoviesDetailsClass>();
		
		movies.add(inception);
		movies.add(avtar);
		movies.add(shwoshangRedumtion);
		movies.add(girlNextDoor);
		movies.add(thor);
		
		ItrateList.itrateList(movies);
		
		
		Collections.sort(movies);
		
		System.out.println("After Sorting...");
		
		ItrateList.itrateList(movies);
		
	}

}
