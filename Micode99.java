import java.util.Scanner;

public class Micode99{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an intger:");
int number1 = input.nextInt();

int square = (number1 * number1);

if(square > 100 && number1 > 100)
System.out.printf("%d greater than 100 %d", square, number1);

if(square < 100 && number1 < 100)
System.out.printf("%d lesser than 100 %d", square, number1);


if(number1 == 100 )
System.out.printf("The numbers is equal to 100 %n");

if(number1 != 100)
System.out.printf("The numbers is not equal to 100 %n");


if(square == 100 )
System.out.printf("The square is equal to 100 %n");

if(square != 100)
System.out.printf("The square is not equal to 100 %n");

}
}

