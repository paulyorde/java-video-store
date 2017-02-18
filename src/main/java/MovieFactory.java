public class MovieFactory {
	// type from file
	public static Movie createRental(String type) {
		Movie movie;
		// titles from file
		switch(type) {
			case "regular":
				movie = new RegularMovie("Mr Mom");
				break;
			case "childrens":
				movie = new ChildrensMovie("Aladin");
				break;
			case "new release":
				movie = new NewReleaseMovie("Cure for WellNess");
				break;
			default:
				throw new IllegalArgumentException();
		}
		return movie;
	}
}
