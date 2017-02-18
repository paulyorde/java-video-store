public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement rentalStatement = new RentalStatement();
		
	    MovieStore videoStore = new VideoMovieStore();
	    Movie mrMom = videoStore.rent("regular");
	    Movie aladdin = videoStore.rent("childrens");
	  	Movie cureForWellness = videoStore.rent("new release");	
		
		Rental regular = RentalFactory.createRental(mrMom, 2);
		Rental childrens = RentalFactory.createRental(aladdin, 4);
		Rental newRelease = RentalFactory.createRental(cureForWellness, 5);
		
		rentalStatement.add(regular);
		rentalStatement.add(childrens);
		rentalStatement.add(newRelease);
		
		rentalStatement.print();
	}

}
