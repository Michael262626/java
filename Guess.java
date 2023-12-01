import java.security.SecureRandom;
import java.util.Scanner;

public class Guess{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	SecureRandom random = new SecureRandom();
	
	int number = random.nextInt(1,11);

	System.out.print("Enter your guessed number: ");
	int num = scanner.nextInt();

	if(number == num){
	System.out.println("correct: random number is " +num);
	
	}
	else if(num > number){
	System.out.println("Too high: random number is " +num);
	}
	
	else if(num < number){
	System.out.println("Too low: random number is " +num);
	}
	System.out.printf("your guess is %d%n", number);
	
	
	
	
	

	

	
	
}









}