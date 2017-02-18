
public class RentalFactory {
	public static Rental createRental(Movie movie, int days) {
		return new Rental(movie, days);
	}
}
