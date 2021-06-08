package Assignment_5;

public class JoiningDate {
	
	private int day;
	private String Month;
	private int year;
	
	public JoiningDate() {
	
	}

	public JoiningDate(int day, String month, int year) {

		this.day = day;
		this.Month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


}
