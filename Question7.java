import java.util.Scanner;
public class Question7 {

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

int odd = 0;
int even = 0;



while(number != -1){
System.out.print("Enter a number: ");
number = scanner.nextInt();

if(number % 2 == 0){
even+=number;
}

if(number % 2 != 0){
odd+=number;
}
}
System.out.println("Sum of even numbers is " +even);
System.out.println("Sum of odd numbers is " +odd);








}






}