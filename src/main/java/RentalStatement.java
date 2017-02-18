import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<>();
	
	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}
	
	public Rental createMovie(Movie movie, int days) {
		return new Rental(movie, days);
	}
	
	public void print() {
		for(Rental rental : rentals) {
			System.out.println(String.format("Move Type is: %s  %n"
					+ "Movie Title is: %s %n"
					+ "Movie price is: %.2f %n"
					+ "Movie days allowed: %d %n",
					rental.getPriceCode(),
					rental.getTitle(),
					rental.calculateFees(),
					rental.getDays()));
		}
	}
}
