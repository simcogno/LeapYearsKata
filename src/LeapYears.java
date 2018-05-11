
public class LeapYears {

	public boolean isLeapYear(int year) {
		
		if(year < 1582)
			return false;
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return true;
		else
			return false;
	}

}
