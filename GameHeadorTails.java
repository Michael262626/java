import java.util.Scanner;

import java.util.Random;

public class GameHeadorTails {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

Random randomNumber = new Random();

int headOrTail = randomNumber.nextInt(2);

System.out.print("Enter a guess (either 0 or 1): ");
int guess = input.nextInt();

if(headOrTail == guess) {
System.out.print("You made a correct guess!!!");
}

else {
System.out.print("You made an incorrect guess");
}



}
} 