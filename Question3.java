import java.util.Scanner;
public class Question3 {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = scanner.nextInt();

System.out.print("Multiplication table of number" +number);


for(int digit = 0; digit<=12; digit++){
System.out.println(number + "x" + digit + "=" + (number*digit));
}








}




}