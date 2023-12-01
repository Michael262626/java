import java.util.Scanner;

public class Question4 {
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 1;

System.out.print("Enter a number: ");
int number = scanner.nextInt();

for(int digit = 1; digit<=number; digit++){

count *= digit;
}

System.out.print("The factorial is " + count);




}



}