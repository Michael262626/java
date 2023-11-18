import java.util.Scanner;

public class Circumference{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius:");
	int radius = input.nextInt();
	
	double diameter = 2 * radius;
	
	System.out.printf("diameter is %.2f%n", diameter);

	double circumference = 2 * 3.14159 * radius;

	System.out.printf("circumference is %.2f%n", circumference);

	double area = 3.14159 * radius * radius;
	
	System.out.printf("area is %.2f%n", area);

	
















}



















}