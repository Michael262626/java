public class MavericksBank{

	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private int monthOfBirth;
	private int dayOfBirth;
	private String password;
	private double balance;
public MavericksBank(String firstName, String lastname; int yearOfBirth, int monthOfBirth, int dayOfBirth, String password, double balance){

this.firstName = firstName;
this.lastName= lastName;
this.yearOfBirth = yearOfBirth;
this.monthOfBirth = monthOfBirth;
this.dayOfBirth = dayOfBirth;
this.password = password;
if(balance>0.0){
this.balance = balance;
}
if(balance < 0.0)
this.balance;

public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public String getLastName(){
return lastName;
}
public void setYearOfBirth(int yearOfBirth){
this.yearOfBirth = yearOfBirth;
}
public int getYearOfBirth(){
return yearOfBirth;
}
public void setMonthOfBirth(int monthOfBirth){
this.monthOfBirth = monthOfBirth;
}
public int getMonthOfBirth(){
return monthhOfBirth;
}
public void setDayOfBirth(int dayOfBirth){
this.dayOfBirth = dayOfBirth;
}
public int getDayOfBirth(){
if(dayOfBirth<0)
System.out.print("Invalid!!!");
return dayOfBirth;
}
public void setPassword(String password){
this.password = password;
}
public void setBalance(double balance){
this.balance = balance; 
}
public void deposit(double depositAmount){
    if(depositAmount > 0.0)
    balance =  balance + depositAmount;
}
public void withdraw(double withdrawAmount){
if(withdrawAmount > balance)
System.out.print("The withdraw amount exceeded balance");
}
else if(withdrawAmount < balance){
this.balance = balance;

public String getPassword(){
return pasword;
}

}

}











}