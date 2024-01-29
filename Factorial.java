import java.util.Scanner;
public class Factorial{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive number from 1-20: ");
		int number = scanner.nextInt();
	int factorial = 1;
	for(int count = 1; count <= number ; count++){

		factorial = factorial *  count;
}
	System.out.printf("%d factorial ==>%d", number, factorial);

	}

}