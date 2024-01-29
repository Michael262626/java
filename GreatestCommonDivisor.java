import java.util.Scanner;

public class GreatestCommonDivisor {
	public static int theGreatestDivisor(int num1, int num2) {
	int divisor = (num1 / num2);
	int result = num1 % num2;
	int finalResult = divisor + result;
	return finalResult;
	}

	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 2 digit numbers");
	int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
	int result  = theGreatestDivisor(number1, number2);
	System.out.printf("G.C.D: %d", result);

	}

}

