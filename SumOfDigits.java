import java.util.Scanner;
public class SumOfDigits {
	public static int sumingNumbers(int number1, int number2, int number3, int number4) {
		int sum = number1 + number2 + number3 + number4;
		return sum;
	}
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("'Enter a 4 digit with spaces: ");
	int digit1 = scanner.nextInt();
	int digit2 = scanner.nextInt();
	int digit3 = scanner.nextInt();
	int digit4 = scanner.nextInt();

	int finalResult = sumingNumbers(digit1, digit2, digit3, digit4);

	System.out.printf("%d",  finalResult);


	}









}