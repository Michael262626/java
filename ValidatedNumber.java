import java.util.Scanner;
public class ValidatedNumber{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);
int count = 0;
System.out.print("Enter a number: ");
int number = scanner.nextInt();
while(number != 1 || number != 2){
System.out.print("Enter a number: ");
number = scanner.nextInt();
number++;
count++;
}



}
}
