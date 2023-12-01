import java.util.Scanner;
public class Healthprofile1 {
public static void main(String [] args){

	HealthProfile healthprofile = new HealthProfile("michael", "michael", "sex", 2023, 5, 27, 6, 40);

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your first name:");
	String firstName = scanner.nextLine();
	healthprofile.setFirstName(firstName);
	
	System.out.print("Enter your last name:");
	String lastName = scanner.nextLine();
	healthprofile.setLastName(lastName);

	System.out.print("Enter your gender:");
	String gender = scanner.nextLine();
	healthprofile.setGender(gender);
	
	System.out.print("Enter your year of birth:");
	int year = scanner.nextInt();
	healthprofile.setYear(year);

	System.out.print("Enter your month of birth:");
	int month = scanner.nextInt();
	healthprofile.setMonth(month);

	
	System.out.print("Enter your days of birth:");
	int days = scanner.nextInt();
	healthprofile.setDays(days);
	
	System.out.print("Enter the value of height:");
	int height = scanner.nextInt();
	healthprofile.setHeight(height);


	System.out.print("Enter the value of weight:");
	int weight = scanner.nextInt();
	healthprofile.setWeight(weight);

	
	System.out.printf("Maximum heartrate is %.2f%n", healthprofile.getMaximumHeartrate());
	
	System.out.printf("Target heartrate is %.2f%n", healthprofile.getTargetHeartrateRange());
	
	System.out.printf("Your age is %d%n", healthprofile.getAge());
	
	System.out.printf("Bmi is %d%n", healthprofile.getBmi());







	
	
	}
}
	

	
