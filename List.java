import java.util.Scanner;
public class List{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	double price = 0;
	System.out.print("Enter an item: ");
	String item = scanner.nextLine();
	System.out.print("Enter the price: ");
	price = scanner.nextDouble();

	if(price < 0){
	System.out.println("Invalid number");
	System.out.println("Re-enter price");
	}
	else{

	double discount = (price * 10)/100;

	double grandTotal = price - discount;

	System.out.printf("item: %s%n", item);
	System.out.printf("price: %.0f%n", price);
	System.out.printf("Discount: %.1f%n", discount);
	System.out.println("---------------------------------");
	System.out.printf("Grand total: %.1f%n", grandTotal);
	System.out.println("---------------------------------");
}
}
}