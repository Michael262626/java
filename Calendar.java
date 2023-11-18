import java.util.Scanner;

public class Calendar
{
public static void main(String[] args)
{

Scanner input;

input = new Scanner(System.in);

System.out.println("Enter an intger between 1 to 12");

int number1;
int number2;
int number3;
int number4;
int number5;
int number6;
int number7;
int number8;
int number9;
int number10;
int number11;
int number12;

int number = input.nextInt();

if(number == 1)
System.out.println("January");

if(number == 2)
System.out.println("February");

if(number == 3)
System.out.println("March");

if(number == 4)
System.out.println("April");

if(number == 5)
System.out.println("May");

if(number == 6)
System.out.println("June");

if(number == 7)
System.out.println("July");

if(number == 8)
System.out.println("August");

if(number == 9)
System.out.println("September");

if(number == 10)
System.out.println("October");

if(number == 11)
System.out.println("November");

if(number == 12)
System.out.println("December");

}
}