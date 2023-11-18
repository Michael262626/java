import java.util.Scanner;

public class Investment{

public static void main(String[] args) {
 Scanner input;
input = new Scanner(System.in);

System.out.print("Enter the investmesnt amount");
int number1 = input.nextInt();

System.out.print("Enter the annual interest rate");
double number2 = input.nextDouble();

System.out.print("Enter the number of years");
int number3 = input.nextInt();

double monthlyInterest=number2 / 12;

double investmentamount = number1 *( 1 + number1 / 12);

System.out.printf("investmentAmount is %3f", investmentamount);

}


}