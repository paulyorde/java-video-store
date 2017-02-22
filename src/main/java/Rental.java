
public class Rental {
	private Movie rented;
	private int days;
	

	public Rental(int days, Movie rented) {
		this.days = days;
		this.rented = rented;
	}

	public int getDays() {
		return days;
	}

	public Movie getRented() {
		return rented;
	}
}
