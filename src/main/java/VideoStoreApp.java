public class VideoStoreApp {

	public static void main(String[] args) {
			RentalStatement rentalStatement = new RentalStatement();
			
		    	MovieStore videoStore = new VideoMovieStore();
		    	Movie mrMom = videoStore.rent("regular");
		    	Movie aladdin = videoStore.rent("childrens");
		  	Movie cureForWellness = videoStore.rent("new release");
		  	
		  	Rental regular = videoStore.createRental(mrMom, 2);
		  	Rental childrens = videoStore.createRental(aladdin, 2);
		  	Rental newRelease = videoStore.createRental(cureForWellness, 2);
			
			rentalStatement.add(regular);
			rentalStatement.add(childrens);
			rentalStatement.add(newRelease);
			
			rentalStatement.print();
	}
}
