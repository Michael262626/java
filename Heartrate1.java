import java.util.Scanner;
public class Heartrate1{
public static void main(String [] args){

	Heartrate heartrate = new Heartrate("michael", "michael", 2023, 5, 27);

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your first name:");
	String firstName = scanner.nextLine();
	heartrate.setFirstName(firstName);
	
	System.out.print("Enter your last name:");
	String lastName = scanner.nextLine();
	heartrate.setLastName(lastName);
	
	System.out.print("Enter your year of birth:");
	int year = scanner.nextInt();
	heartrate.setYear(year);

	System.out.print("Enter your month of birth:");
	int month = scanner.nextInt();
	heartrate.setMonth(month);

	
	System.out.print("Enter your days of birth:");
	int days = scanner.nextInt();
	heartrate.setDays(days);
	
	System.out.printf("Maximum heartrate is %.2f%n", heartrate.getMaximumHeartrate());
	
	System.out.printf("Target heartrate is %.2f%n", heartrate.getTargetHeartrateRange());
	
	System.out.printf("Your age is %d%n", heartrate.getAge());
	
	
	}
}
	

	
