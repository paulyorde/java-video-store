
public abstract class MovieStore {
	
	public Movie rent(String priceCode) {
		return createMovie(priceCode);
	}
	
	public Rental createRental(Movie movie, int days) {
		return new Rental(movie, days);
	}
	
	public abstract Movie createMovie(String priceCode);
}
