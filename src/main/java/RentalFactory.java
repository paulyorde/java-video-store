public class RentalFactory {
	
	// pass in file , read file, get type
	public static Movie createRental(String type) {
		Movie movie;
		
		switch(type) {
			case "regular":
				// get title from file
				movie = new RegularMovie("Mr. Mom");
				break;
			default:
				throw new IllegalArgumentException();
		}
		return movie;
	}
}
