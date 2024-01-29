import java.util.Scanner;

public class Weather{
	public static String sportsRecommender(int number) {
	
	if(number == 0 || number == 100){
		return"It's lovely weather for sports today";
	}
	else if(number <= 30 && number >= 20){
		return"It's reasonable weather for sports today.";
	}
	else if(number <= 10 && number >= 40){
		return "Please exercise with care today, watch out for the weather!";
		}
	else {
		return "Enter a valid temperature!";
		}
	}
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your celcius temperature: ");
	int number = scanner.nextInt();
	String result = sportsRecommender(number);
	System.out.print(result);
	}
}