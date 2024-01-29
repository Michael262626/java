import java.util.Scanner;
public class PrimeNumbers{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a positive number: ");
	int number = scanner.nextInt();
	
	if(number < 0){
	System.out.print("invalid number");
	return;
	}
	
	for(int i = 2; i < number; i++){
	if(number % i == 0){
	
System.out.printf("%d is not a prime number", number);
return;
	
	}
	}


System.out.printf("%d is a prime number", number);

}
}