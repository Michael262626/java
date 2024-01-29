import java.util.*;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class checkOutApp{
	private  static String customerName;
	private static String cashierName;
	private static double subTotal;
	private static double discount;
	private static double amountPaid;
	private static double quantity;
	public checkOutApp(String customerName, String cashierName, double subTotal, double discount, double amountPaid, double quantity){
checkOutApp.customerName = customerName;
checkOutApp.cashierName = cashierName;
checkOutApp.subTotal = subTotal;
checkOutApp.discount = discount;
checkOutApp.amountPaid = amountPaid;
}
	public static void setCustomerName(String customerName){
	checkOutApp.customerName = customerName;
	}
	public static String getCustomerName(){
	return customerName;
	}
	public static void setCashierName(String cashierName){
	checkOutApp.cashierName = cashierName;
	}
	public static String getCashierName(){
	return cashierName;
	}
	public static void setDiscount(double discount){
	checkOutApp.discount = discount;
	}
	public static double getDiscount(){
	return discount;
	}
	public static void setAmountPaid(double amountPaid){
	checkOutApp.amountPaid = amountPaid;
	}
	public static double getAmountPaid(){
	return amountPaid;
	}
	public static double getDiscountTotal(){
	return subTotal * (discount / 100.0);
	}
	public static void setSubTotal(double subTotal){
	checkOutApp.subTotal = subTotal;
	}
	public static double getSubTotal(){
	return subTotal;
	}
	public static double getVat(){
	return subTotal * (7.5 / 100);
	}
	public static double getBillTotal(){
	return (subTotal - getDiscountTotal()) + getVat();
	}
	public static double getBalance(){
	return amountPaid - getBillTotal();
	}
	public static void setQuantity(double quantity){
	checkOutApp.quantity = quantity;
	}
	public static double getQuantity(){
	return quantity;
	}
public static void main(String... args){
ArrayList<String> itemList = new ArrayList<>();
ArrayList<Double> quantities = new ArrayList<>();
ArrayList<Double> priceList = new ArrayList<>();
ArrayList<Double> totalList = new ArrayList<>();

	Calendar calendar = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);
	
	double total = 0;
	System.out.println("What is the customer name?");
	String customerName = scanner.nextLine();
	setCustomerName(customerName);

		String choice = " ";
		do{
		System.out.println("What did the user buy?");
		String item  = scanner.next();
		itemList.add(item);

		System.out.println("How many pieces?");
		double quantity = scanner.nextDouble();
		quantities.add(quantity);

		System.out.println("How much per unit?");
		double price = scanner.nextDouble();
		priceList.add(price);

		total += quantity * price;
		totalList.add(total);

		System.out.println("Add more items?");
		choice  = scanner.next();
		}while(choice.equalsIgnoreCase("yes"));	
		if(!choice.equals("yes")){
		System.out.println("What is the cashier name?");
		String cashierName = scanner.next();
		setCashierName(cashierName);
		System.out.println("How much discount will he get?");
		discount = scanner.nextInt(); 
		}
	double sumItems = 0;
	for(int count = 0; count<itemList.size(); count++){
		sumItems += total;
	}
	setSubTotal(sumItems);
	
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
System.out.println("TEL: 03293828343");
System.out.println("Date:" +calendar.getTime());
System.out.println("Cashier:" +cashierName);
System.out.println("Customer Name:" +customerName);
System.out.println("\t\t----------------------------------------------------------------------");
System.out.println("\t\t----------------------------------------------------------------------");
System.out.println("\t\t\t\tITEM\tQty\tPRICE\tTOTAL(NGN)");
System.out.println("\t\t----------------------------------------------------------------------");
for (int index = 0; index < quantities.size(); index++) {
System.out.printf("\t\t\t\t%5s\t%.0f\t%.2f\t%.2f%n", itemList.get(index), quantities.get(index), priceList.get(index), totalList.get(index));
}
System.out.println("\t\t----------------------------------------------------------------------");
System.out.println(" \t\t\t\tSub Total: " +getSubTotal());
System.out.printf("\t\t\t\tDiscount: %.2f\n", getDiscountTotal());
System.out.println("\t\t\t\tVAT @ 17.5% " +getVat());
System.out.println("\t\t-----------------------------------------------------------------------");
System.out.println("\t\t-----------------------------------------------------------------------");
System.out.println("\t\t\t\tBill Total: " +getBillTotal());
System.out.println("\t\t------------------------------------------------------------------------");
System.out.println("\t\t------------------------------------------------------------------------");
System.out.println("\t\t\t\tTHIS IS NOT AN RECEIPT KINDLY PAY " +getBillTotal	());	
System.out.println("\t\t------------------------------------------------------------------------");
System.out.println("\t\t------------------------------------------------------------------------");




System.out.println("HOW MUCH DID THE CUSTOMER GIVE TO YOU?");
amountPaid = scanner.nextInt();
System.out.println("""






""");
do{
amountPaid = scanner.nextInt();
if(amountPaid < getBillTotal()){
System.out.println("Your money is less than the expected price\nKindly pay the expected amount.");
}
}
while(amountPaid > getBillTotal());


System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
System.out.println("TEL: 03293828343");
System.out.println("Date:" +calendar.getTime());
System.out.println("Cashier:" +cashierName);
System.out.println("Customer Name: " +customerName);
System.out.println("\t\t--------------------------------------------------------------------------");
System.out.println("\t\t--------------------------------------------------------------------------");
System.out.println("\t\t\t\tITEM\tQty\tPRICE\tTOTAL(NGN)");
System.out.println("\t\t--------------------------------------------------------------------------");
for (int index = 0; index < quantities.size(); index++) {
System.out.printf("\t\t\t\t%5s\t%.0f\t%.2f\t%.2f%n", itemList.get(index), quantities.get(index), priceList.get(index), totalList.get(index));
}
System.out.println("\t\t--------------------------------------------------------------------------");
System.out.printf(" \t\t\t\tSub Total: %.2f%n", getSubTotal());
System.out.println("\t\t\t\tDiscount: " +getDiscountTotal());
System.out.println("\t\t\t\tVAT @ 17.5%" +getVat ());
System.out.println("\t\t---------------------------------------------------------------------------");
System.out.println("\t\t---------------------------------------------------------------------------");
System.out.println("\t\t\t\tBill Total: " +getBillTotal());
System.out.println("\t\t\t\tAmount Paid: " +amountPaid);
System.out.println("\t\t\t\tBalance:" +getBalance());
System.out.println("\t\t---------------------------------------------------------------------------");
System.out.println("\t\t----------------------------------------------------------------------------");
System.out.println("\t\t\t\tTHANK YOU FOR YOUR PATRONAGE");
System.out.println("\t\t----------------------------------------------------------------------------");
System.out.println("\t\t----------------------------------------------------------------------------");



}


}

