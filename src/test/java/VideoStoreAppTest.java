import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class VideoStoreAppTest {
	
	@Test
	public void shouldReturnCalculatedRentalWhenGivenMovie() {
		Movie regularMovie = new RegularMovie("Mr Mom");
		Rental rental = new Rental(1, regularMovie);
		
		Strategy strategy;
		
		MovieStore store = new MovieStore(rental, strategy);
		
		assertEquals(expected, actual);
	}
}
