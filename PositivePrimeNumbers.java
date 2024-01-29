import java.util.Scanner;
public class PositivePrimeNumbers{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a positive number: ");
		int number = scanner.nextInt();

		if(number<0){
			System.out.print("This is a inavlid number\nkindly re-enter a number above 0");
				number = scanner.nextInt();
		}
		for(int count = 2; count < number; count++){
			if(number % count == 0){
				System.out.printf("%d is not a prime number", number);
				return;	
			}
		}

	System.out.printf("%d is a prime number", number);
}






}