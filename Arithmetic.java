import java.util.Scanner;
public class Arithmetic{
 
public static void main(String[] args){


Scanner input;
 input = new Scanner(System.in);

System.out.println("Enter an integer");
int number1 = input.nextInt();

System.out.println("Enter an integer");
int number2 = input.nextInt();

System.out.println("Enter an integer");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;

System.out.println("Sum is " + sum);

int average = number1 + number2 + number3  / 3;
System.out.println("Average is "+ average);

int multiply = number1 * number2 * number3;
System.out.println("Multiplication is "+ multiply);

if(number1 < number2 && number1 < number3)
{
System.out.println("The smallest number is:" +number1);

}
else if(number2 < number3)
{

System.out.println("The smallest number is:"+number2);
}
else
{
System.out.println("The smallest number is:"+number3);
}
if(number1 >= number2 && number1 >= number3)
{
System.out.println("The largest number is:" +number1);
}
else if(number2 >= number1 && number2 >= number3)
{
System.out.println("The largest number is:" +number2);
}
else 
{
System.out.println("The largest number is:" +number3);
}

}
}
 