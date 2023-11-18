import java.util.Scanner;
 public class Space
{

public static void main(String[] args)
{

Scanner input;

input = new Scanner(System.in);

int firstNumber;
int secondNumber;
int thirdNumber;
int fourthNumber;

System.out.println("Enter first number");
firstNumber = input.nextInt();

 System.out.println("Enter second number");
secondNumber = input.nextInt();

System.out.println("Enter third number");
thirdNumber = input.nextInt();

System.out.println("Enter fourth number");
fourthNumber = input.nextInt();

System.out.printf("%d %d %d %d%n%n", firstNumber, secondNumber, thirdNumber, fourthNumber);
}
}