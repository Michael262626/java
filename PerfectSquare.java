import java.util.Scanner;
public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
	int perfectNum = 0;
	int sum = 0;
	for(int count = 1; count <= 1000; count++) {
		for(int index = 1; index <= number; index++) {
		if(sum %2 == 0){
			sum = count += index;
			return true;
		}
		}
	}
			return false;
	}
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number  = scanner.nextInt();
	boolean check = isPerfectSquare(number);
	System.out.printf("%s", check);
	}
}
