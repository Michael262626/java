import java.util.Scanner;
public class ReverseDigit{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enetr a number: ");
	int number = scanner.nextInt();

	int number1 = (number/10000) % 10;
	int number2 = ((number/1000)%10)%10;
	int number3 = ((number/100)%10)%10;
	int number4 = ((number/10)%10)%10;
	int number5 = ((number%10))%10;
System.out.printf("%d%d%d%d%d", number5, number4, number3, number2, number1);

}
}