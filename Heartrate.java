public class Heartrate{

	private String firstName;
	private String lastName;
	private int year;
	private int month;
	private int days;
	
public Heartrate(String firstName, String lastName, int year, int month, int days){
	this.firstName = firstName;
	this.lastName = lastName;
	this.year = year;
	this.month = month;
	this.days = days;
	}
	public void setFirstName(String firstName){
	this.firstName = firstName;
	}
	public String getFirstName(){
	return firstName;
	}
	public void setLastName(String lastName){
	this.lastName = lastName;
	}
	public String lastName(){
	return lastName;
	}
	public void setYear(int year){
	this.year = year;
	}
	public int getYear(){
	return year;
	}
	public void setMonth(int month){
	this.month = month;
	}
	public int getMonth(){
	return month;
	}
	public void setDays(int days){
	this.days = days;
	}
	public int getDays(){
	return days;
	}
	public int getAge(){
	int age = 2023 - year;
	return age;
	}
	public double getMaximumHeartrate(){
	double maximumHeartrate = 220 - getAge();
	return maximumHeartrate;
	}
	public double getTargetHeartrateRange(){
	double targetHeartrateRange = (85 * getMaximumHeartrate()) / 100;
	return targetHeartrateRange;
	} 

}