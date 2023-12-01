public class HealthProfile{

	private String firstName;
	private String lastName;
	private String gender;
	private int year;
	private int month;
	private int days;
	private int height;
	private int weight;

public HealthProfile(String firstName, String lastName, String gender, int year, int month, int days, int height, int weight){
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.year = year;
	this.month = month;
	this.days = days;
	this.height = height;
	this.weight = weight;
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
	public String getlastName(){
	return lastName;
	}
	public void setGender(String gender){
	this.gender = gender;
	}
	public String getGender(){
	return gender;
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
	public void setHeight(int height){
	this.height = height;
	}
	public int getHeight(){
	return height;
	}
	public void setWeight(int weight){
	this.weight = weight;
	}
	public int getWeight(){
	return weight;
	}
	public double getMaximumHeartrate(){
	double maximumHeartrate = 220 - getAge();
	return maximumHeartrate;
	}
	public double getTargetHeartrateRange(){
	double targetHeartrateRange = (85 * getMaximumHeartrate()) / 100;
	return targetHeartrateRange;
	} 
	public int getBmi(){
	int bmi = (weight * 703) / (height * height);
	if(bmi < 18.5)
	System.out.println("under weight");

	if(bmi >= 18.5 || bmi < 24.9)
	System.out.println("normal weight");

	if(bmi == 25 && bmi > 30)
	System.out.println("over weight");

	if(bmi > 30)
	System.out.println("obesity");
	return bmi;
	}
}