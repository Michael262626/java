import java.util.Scanner;

public class Micode2{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer:");
int number1 = input.nextInt();

System.out.println("Enter an integer:");
int number2 = input.nextInt();

int triple = number1 * number1 * number1;

int square = number2 * number2;

if(triple % square == 0)
{System.out.printf("%d is a multiple of %d", triple, square);}

else
{System.out.printf("%d is not a multiple of %d", triple, square);}

}
}




