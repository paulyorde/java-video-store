import java.math.BigDecimal;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title, "new release");
	}

	@Override
	public BigDecimal caclulateFees(int days) {
		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
	}
}
