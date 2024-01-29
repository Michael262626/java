import java.util.Scanner;
public class PackingCharges {
public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the hours: ");
	double hours = scanner.nextDouble();

	double result = CalculateCharges(hours);
	
	System.out.printf("\nCharge for the customer is: $ %.2f", result);	
	
	double total = 0;
	for(int index = 0; index <  4; index++){
		total += result;

	}
		System.out.printf("\nThe running total of yesterday reciepts is %.2f", total);
}
public static double CalculateCharges(double hours){
	double cost = 0.0;
	if(hours <= 3){
		cost = 2.00;
	}
	else if(hours == 1){
		cost = 0.50;
	}
	else if(hours > 3 && hours <= 23){
		cost =(hours * 0.66) + 0.50;
	}
	else if(hours == 24){
		cost = 10.0;
	}
	else{
		cost = 0.0;
	}
	return cost;
	
}



}