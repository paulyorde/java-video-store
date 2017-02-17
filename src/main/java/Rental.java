import java.math.BigDecimal;

public class Rental {
	private Movie rented;
	private int   days;
	
	public Rental(Movie movie, int days) {
		rented = movie;
		this.days = days;
	}
	
	public BigDecimal calculateFees() {
		return rented.caclulateFees(days);
	}
	
	public String getTitle() {
		return rented.getTitle();
	}
	
	public String getPriceCode() {
		return rented.getPriceCode();
	}
}

