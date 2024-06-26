package day1;

public class MyDate {
	
	private int day;
	private String month;
	private int year;
	public void setDate(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void displayDate() {
		System.out.println("Date: "+day+"/"+month+"/"+year );
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
