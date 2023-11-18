import java.util.Scanner;

public class Game1{
public static void main(String[] args){

Scanner input;
input = new Scanner(System.in);

System.out.println("Enter playerone name:");
String playerone = input.nextLine();

System.out.println("Enter a number from 0, 1 or 2:");
int number1 = input.nextInt();

System.out.println("Enter playertwo name:");
String playertwo = input.nextLine();

System.out.println("Enter a number from 0, 1 or 2:");
int number2 = input.nextInt();


if(number1 == 0 && number2 == 1)
System.out.printf("%s won %s", playerone, playertwo);

if(number1 == 1 && number2 == 0)
System.out.printf("%s won %s", playertwo, playerone);

if(number1 == 1 && number2 == 2)
System.out.printf("%s won %s", playertwo, playerone);

if(number1 == 2 && number2 == 1)
System.out.printf("%s won %s", playerone, playertwo);

if(number1 == 0 && number2 == 2)
System.out.printf("%s won %s", playerone, playertwo);

if(number1 == 2 && number2 == 0)
System.out.printf("%s won %s", playertwo, playerone);

if(number1 == 0 && number2 == 0)
System.out.println("Draw");

if(number1 == 1 && number2 == 1)
System.out.println("Draw");

if(number1 == 2 && number2 == 2)
System.out.println("Draw"); 

}
}
