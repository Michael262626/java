import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a five digit number: ");
	int number = scanner.nextInt();
	if(number / 10000 < 1 || number / 10000 >9){
	System.out.println("Invalid number");
	System.out.println("Re-enter number");
	}
else{
	int number1 = number / 10000;
	int remainder = number % 10000;
	int number2 = remainder / 1000;
	int remainder1 = remainder % 1000;
	int number3 = remainder1 / 100;
	int remainder2 = remainder1 % 100;
	int number4 = remainder2 / 10;
	int number5 = remainder2 % 10;
	System.out.printf("%d%d%d%d%d", number5, number4, number3, number2, number1);

}

}

}