public class RentalFactory {
	
	public Movie createRental(String type) {
		Movie movie;
		
		switch(type) {
			case "regular":
				movie = new RegularMovie(type);
				break;
			default:
				throw new IllegalArgumentException();
		}
		return movie;
	}
}
