
public abstract class MovieStore {
	
	public Movie rent(String priceCode) {
		Movie movie;
		movie = createMovie(priceCode);
		return movie;
	}
	
	public Rental createRental(Movie movie, int days) {
		return new Rental(movie, days);
	}
	
	public abstract Movie createMovie(String priceCode);
}
