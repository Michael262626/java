import java.util.Scanner;

public class Car1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);


Car car1 = new Car("mercedezBenz", "february 27 2023", 1500);

System.out.print("Enter the discount price:");
double discountPrice1 = scanner.nextDouble();

car1.setDiscount(discountPrice1);

System.out.printf("Model is: %s%n", car1.getModel());

System.out.printf("Year is: %s%n", car1.getYear());

System.out.printf("price is: $%.2f%n", car1.getPrice());

System.out.printf("Discount price is: $%.2f%n", car1.getDiscountPrice());


Car car2 = new Car("lexus", "march 26 2023", 2500);
System.out.print("Enter the discount price:");

double discountPrice2 = scanner.nextDouble();

car2.setDiscount(discountPrice2);

System.out.printf("Model is: %s%n", car2.getModel());

System.out.printf("Year is: %s%n", car2.getYear());

System.out.printf("price is: $%.2f%n", car2.getPrice());

System.out.printf("Discount price is: $%.2f%n", car2.getDiscountPrice());
 















}






}