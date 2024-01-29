import java.util.Scanner;
public class YearGivesAge{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your year of birth: ");
	int yearOfBirth = scanner.nextInt();
	
		while(yearOfBirth < 1 || yearOfBirth > 2024){
			System.out.print("Invalid Year \nRe-enter year: ");
				 yearOfBirth = scanner.nextInt();
		}
	int age = 2024 - yearOfBirth;
	System.out.printf("You are %d years old", age);
	}






}