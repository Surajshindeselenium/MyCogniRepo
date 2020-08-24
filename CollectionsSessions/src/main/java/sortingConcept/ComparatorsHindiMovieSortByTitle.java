package sortingConcept;

import java.util.Comparator;

public class ComparatorsHindiMovieSortByTitle implements Comparator<MoviesDetailsClass>{

	public int compare(MoviesDetailsClass movieRating, MoviesDetailsClass anotherMovieRating) {
		
		if(movieRating.getRating()>anotherMovieRating.getRating()) {
			return +1;
			
		}
		if(movieRating.getRating()<anotherMovieRating.getRating()) {
			return -1;
			
		}
		
		
		
		return 0;
	}

	
	
	
	

}
