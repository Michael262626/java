import java.util.Scanner;

public class squaredMultiply
{

public static void main(String[] args)
{

Scanner input;
input = new Scanner(System.in);

int firstNumber;
int secondNumber;

System.out.println("Enter first number");
firstNumber = input.nextInt();
 
System.out.println("Enter second number");
secondNumber = input.nextInt();

int square1 = (firstNumber * firstNumber);
System.out.println("Square of "+ square1 );

int square2 = (secondNumber * secondNumber);
System.out.println("Square of "+ square2 );

int sum = ((firstNumber * firstNumber)) + ((secondNumber * secondNumber));
System.out.println("Sum of "+ sum);

int substract = (firstNumber * firstNumber - secondNumber * secondNumber);
System.out.println("Substract of"+ substract);













}

}