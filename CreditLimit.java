import java.util.Scanner;
public class CreditLimit{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your account number: ");
	String number = scanner.nextLine();

	System.out.print("Enter your begining balance: ");
	double balance = scanner.nextDouble();
	
	System.out.print("Enter items charged or enter -1 to end: ");
	double items = scanner.nextDouble();
	
	double newBalance = 0.0;
	double totalItemsCharged = 0;
	double totalCreditApplied = 0;
	double creditLimit = 0;
	
	while(items != -1){
	System.out.print("Enter credit applied: ");
	double credit = scanner.nextDouble();
	
	totalItemsCharged += items;
	totalCreditApplied += credit;
	newBalance = balance - items - credit;
	
	System.out.print("Enter items charged or enter -1 to end: ");
	items = scanner.nextDouble();
	
	if(newBalance > 5000){
	System.out.println("You have reached your credit limit");
	}
	}
	System.out.printf("Total items charged is: %.1f%n", totalItemsCharged);
	System.out.printf("Total credit applied is: %.1f%n", totalCreditApplied);
	System.out.printf("your new balance is: %.1f%n", newBalance);
		

}
}
	