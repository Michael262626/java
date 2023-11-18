import java.util.Scanner;

public class Square{

public static void main(String[] args){

Scanner input;
input = new Scanner(System.in);

System.out.println("Enter an integers:");
int number1 = input.nextInt();

System.out.println("Enter an integers:");
int number2 = input.nextInt();

int square1 = number1 * number1;
System.out.printf("The result is %d%n", square1);

int square2 = number2 * number2;
System.out.printf("The result is %d%n", square2);

int sum = square1 + square2;
System.out.printf("The results is %d%n", sum);

int substract = square1 - square2;
System.out.printf("The result is %d%n", substract);

}
}
