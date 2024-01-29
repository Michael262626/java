import java.util.Scanner;
public class LeapYear {
	public static boolean isLeapYear(int year){
	int years = year % 4;	
		if(years == 0 && (years != 1700)&&(years != 1800)&&(years != 1900)&&(years!= 2100)&&(years != 2300)&&(years != 2200)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		boolean result = isLeapYear(year);
		System.out.print(result);
	}
}