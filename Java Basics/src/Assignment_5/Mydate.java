package Assignment_5;

public class Mydate {

	private int day;
	private String Month;
	private int year;
	
	public Mydate() {
	
	}

	public Mydate(int day, String month, int year) {

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
