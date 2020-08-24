package sortingConcept;

public class MoviesDetailsClass implements Comparable<MoviesDetailsClass> {

	private String movieName;
	private String actorName;
	private String directorName;
	private double rating;
	
	
	
	public MoviesDetailsClass(String movieName, String actorName, String directorName, double rating) {
		
		this.movieName = movieName;
		this.actorName = actorName;
		this.directorName = directorName;
		this.rating = rating;
		
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MoviesDetailsClass [movieName=" + movieName + ", actorName=" + actorName + ", directorName="
				+ directorName + ", rating=" + rating + "]";
	}

	public int compareTo(MoviesDetailsClass movieRating) {
		
		//"return this.getRating().compareTo(movieRating.rating);" will sort movies list in ascending order
		//To sort in descending order just put minus sign '-' as below,
		
		return - this.getRating().compareTo(movieRating.rating);
	}
	
	

}
