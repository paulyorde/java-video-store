
public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement rentalStatement = new RentalStatement();
		
		Movie theCell = new RegularMovie("The Cell");
		Movie up = new ChildrensMovie("Up");
		Movie drStrange = new NewReleaseMovie("Dr Strnage");
		
		Rental regular = new Rental(theCell, 3);
		Rental childrens = new Rental(up, 3);
		Rental newRelease = new Rental(drStrange, 1);
		
		rentalStatement.add(regular);
		rentalStatement.add(childrens);
		rentalStatement.add(newRelease);
		
		rentalStatement.print();
	}

}
