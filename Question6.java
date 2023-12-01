import java.util.Scanner;
public class Question6{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
int reverse = 0;
System.out.print("Enter a number: ");
int number = scanner.nextInt();

int remainder = 0;

while(number > 0){
remainder = number % 10;
reverse = reverse * 10 + remainder;
number /= 10;
}
System.out.println(reverse);

	











}
}