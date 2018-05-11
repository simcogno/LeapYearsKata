import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeapYearsTest {

	private LeapYears leapYears;
	
	@Before
	public void setUp() throws Exception {
		leapYears = new LeapYears();
	}
	
	@Test
	public void aYearBeforTheStartOfGregorianCalendarCanNotBeLeap() {
		assertFalse(leapYears.isLeapYear(800));
		assertFalse(leapYears.isLeapYear(4));
	}

	@Test
	public void ifYearIsDivisibleBy400ThanIsLeapYear() {
		assertTrue(leapYears.isLeapYear(1600));
		assertTrue(leapYears.isLeapYear(2000));
		assertTrue(leapYears.isLeapYear(2400));
	}
	
	@Test
	public void ifDivisibleBy100ShouldAlsoBeDivisibleBy400ToBeLeapYear() {
		assertFalse(leapYears.isLeapYear(1700));
		assertFalse(leapYears.isLeapYear(1800));
		assertFalse(leapYears.isLeapYear(1900));
		assertFalse(leapYears.isLeapYear(2100));
	}
	
	@Test
	public void ifDivisibleBy4AndNotBy100ThenIsLeapYear() {
		assertTrue(leapYears.isLeapYear(2008));
		assertTrue(leapYears.isLeapYear(2012));
		assertTrue(leapYears.isLeapYear(2016));
	}
	
	@Test
	public void ifDivisibleBy4AndBy100ThenIsNotLeapYear() {
		assertFalse(leapYears.isLeapYear(1800));
		assertFalse(leapYears.isLeapYear(1900));
	}
	
	@Test
	public void allYearsNotDivisibleBy4AreNotLeapYears() {
		assertFalse(leapYears.isLeapYear(2017));
		assertFalse(leapYears.isLeapYear(2018));
		assertFalse(leapYears.isLeapYear(2019));
	}

}
