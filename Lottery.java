import java.util.Scanner;
 

public class Lottery {

public static void main(String[] args){

int lottery = (int) (Math.random() * 100);

Scanner input = new Scanner(System.in);
System.out.println("Enter your lucky number:");

int guess = input.nextInt();

System.out.println("The lottery number is" + lottery);

int lotteryDigit1 = lottery / 10;

int lotteryDigit2 =  lottery % 10;

int guessDigit1 = guess / 10;

int guessDigit2 = guess % 10;

if(guess == lottery)

System.out.println("Congratulations! you won $10,000");


else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
System.out.println("Congratulations! you won $3,000");

else if(guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
 System.out.println("Congratulations! you won $1,000");

else
System.out.println("Better luck next time!!");




}
}

