import java.util.Scanner;

public class Micode1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer:");
int number = input.nextInt();

if(number % 3 == 0)
System.out.printf("%d is divisible by %d", number, 3);

if(number % 3 != 0)
System.out.printf("%d is not divisible %d", number, 3);

}

}


