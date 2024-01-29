import java.util.Scanner;
public class WhileNumbers{

	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	int largestNumber = 0;
	int total = 0;
	int count = 1;
System.out.print("Enter a number: ");
int number  = scanner.nextInt();
while(count<3){
	System.out.print("Enter a number: ");
	number  = scanner.nextInt();

	if(number>largestNumber){
		largestNumber = number;
		count++;
		}
	}
System.out.printf("Largest number is: %d", largestNumber);
}
}
