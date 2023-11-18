import java.util.Scanner;

 	public class Fahrenheit
{
 public static void main(String[] args)
{

Scanner input;
 input = new Scanner(System.in);

System.out.print("Enter a number");
 double number = input.nextDouble();

double fahrenheit = (9.0 / 5) * number + 32;

System.out.printf("Fahrenheit %3f", fahrenheit);

}
}