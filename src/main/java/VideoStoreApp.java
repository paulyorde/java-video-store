public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement rentalStatement = new RentalStatement();
		
		// read file from factory
		Movie theCell = MovieFactory.createRental("regular");
		Movie up = MovieFactory.createRental("childrens");
		Movie drStrange = MovieFactory.createRental("new release");		
		
		// read file from factory
		Rental regular = RentalFactory.createRental(theCell, 2);
		Rental childrens = RentalFactory.createRental(up, 4);
		Rental newRelease = RentalFactory.createRental(drStrange, 5);
		
		rentalStatement.add(regular);
		rentalStatement.add(childrens);
		rentalStatement.add(newRelease);
		
		rentalStatement.print();
	}

}
