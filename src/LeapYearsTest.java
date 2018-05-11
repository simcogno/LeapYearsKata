import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearsTest {

	@Test
	public void ifYearIsDivisibleBy400ThanIsLeapYear() {
		LeapYears leapYears = new LeapYears();
		assertTrue(leapYears.isLeapYear(400));
	}
	
	@Test
	public void ifYearIsNotDivisibleBy400ThanIsNotLeapYear() {
		LeapYears leapYears = new LeapYears();
		assertFalse(leapYears.isLeapYear(1000));
	}

}
