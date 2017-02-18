
public abstract class MovieStore {
	
	public Movie rent(String movieType) {
		Movie movie;
		movie = createMovie(movieType);
		return movie;
	}
	
	public abstract Movie createMovie(String movieType);
}
