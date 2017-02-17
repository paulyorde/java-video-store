public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement rentalStatement = new RentalStatement();
		
		Movie myMovieOrder = RentalFactory.createRental("regular");
		
		// factory returns movie based on file
		Movie theCell = new RegularMovie("The Cell");
		Movie up = new ChildrensMovie("Up");
		Movie drStrange = new NewReleaseMovie("Dr Strnage");
		
		// want days to come from file
		Rental regular = new Rental(theCell, 3);
		Rental childrens = new Rental(up, 3);
		Rental newRelease = new Rental(drStrange, 1);
		Rental reg = new Rental(myMovieOrder, 5);
		
		
		rentalStatement.add(regular);
		rentalStatement.add(childrens);
		rentalStatement.add(newRelease);
		rentalStatement.add(reg);
		
		rentalStatement.print();
	}

}
