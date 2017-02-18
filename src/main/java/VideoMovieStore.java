
public class VideoMovieStore extends MovieStore {

	@Override
	public Movie createMovie(String priceCode) {
		Movie movie;
		switch(priceCode) {
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
