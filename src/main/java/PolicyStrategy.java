
public class PolicyStrategy implements Strategy {

	@Override
	public void calculateFees(int days, int extraDays, int baseFee, int extraFee) {
		baseFee + (extraDays - days) * extendedFee;
	}

}
