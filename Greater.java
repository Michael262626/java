import java.util.Scanner;

public class Greater{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Enter an intger");
int number = input.nextInt();

int square = number * number;

if(number > 100)
{System.out.printf("%d is greater than %d%n", number, 100);}

if(square > 100)
{System.out.printf("%d is greater than %d%n", square, 100);}

if(number == 100)
{System.out.printf("%d == 100 %d%n", number, 100);}

if(square == 100)
{System.out.printf("%d == %d%n", square, 100);}

if(number != 100)
{System.out.printf("%d !=  %d%n", number, 100);}

if(square != 100)
{System.out.printf("%d != %d%n", square, 100);}

if(number < 100)
{System.out.printf("%d is less than %d%n", number, 100);}

if(square < 100)
{System.out.printf("%d is less than %d%n", square, 100);}

}
}



