
public class LeapYears {
	
	private int year;

	public boolean isLeapYear(int year) {
		
		this.year = year;
		
		if(isBeforeGregorianCalendar())
			return false;
		
		if(isDivisibleBy(400) || (isDivisibleBy(4) && !isDivisibleBy(100)))
			return true;
		else
			return false;
	}
	
	private boolean isDivisibleBy(int divisor) {
		return year % divisor == 0;
	}


	private boolean isBeforeGregorianCalendar() {
		return year < 1582;
	}

}
