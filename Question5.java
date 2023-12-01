import java.util.Scanner;

public class Question5 {
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 1;

System.out.print("Enter a number: ");
int number1 = scanner.nextInt();

System.out.print("Enter a number: ");
int number2 = scanner.nextInt();

for(int digit = 1; digit<=number2; digit++){

count *= number1;
}
System.out.println("power is " + count);




}






}