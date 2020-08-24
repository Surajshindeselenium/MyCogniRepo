package sortingConcept;

import java.util.ArrayList;
import java.util.Collections;

public class MoviesApp {

	public static void main(String[] args) {
		
		ArrayList<MoviesDetailsClass> hindiMovies = new ArrayList<MoviesDetailsClass>();
		hindiMovies.add(new MoviesDetailsClass("Dil chahta hai", "Amir khan", "Unknown", 8.5));
		hindiMovies.add(new MoviesDetailsClass("Dev das", "Shahrukh khan", "Sanjay lila bhasali", 8.3));
		hindiMovies.add(new MoviesDetailsClass("Swades", "Shahrukh khan", "Ashitosh Gowarikar", 8.9));
		hindiMovies.add(new MoviesDetailsClass("Dhadkan", "Akshay Kumar", "Unknown 1", 7.5));
		hindiMovies.add(new MoviesDetailsClass("Gangs of Wasepur", "Manoj Vajpeyi", "Anurag Kashyap", 9.1));
		
		ItrateList.itrateList(hindiMovies);
		
		System.out.println("After sorting...");
		
		ComparatorsHindiMovieSortByTitle ratingComparator = new ComparatorsHindiMovieSortByTitle();
		
		Collections.sort(hindiMovies, ratingComparator);
		
		ItrateList.itrateList(hindiMovies);
		
		
		
		
		

	}

}
