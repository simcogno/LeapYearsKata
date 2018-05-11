
public class LeapYears {
	
	private int year;

	public boolean isLeapYear(int year) {
		
		this.year = year;
		
		if(isBeforeGregorianCalendar())
			return false;
		
		if(isDivisibleBy400() || (isDivisibleBy4() && isNotDivisibleBy100()))
			return true;
		else
			return false;
	}

	private boolean isNotDivisibleBy100() {
		return year % 100 != 0;
	}

	private boolean isDivisibleBy4() {
		return year % 4 == 0;
	}

	private boolean isDivisibleBy400() {
		return year % 400 == 0;
	}

	private boolean isBeforeGregorianCalendar() {
		return year < 1582;
	}

}
