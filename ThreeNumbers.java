import java.util.Scanner;
public class ThreeNumbers{

public static void main(String... args){
Scanner scanner = new Scanner(System.in);
int largestNumber = 0;
int total = 0;
System.out.print("Enter a number: ");
int number  = scanner.nextInt();

for(int count = 0; count <= 3; count++){
System.out.print("Enter a number: ");
number  = scanner.nextInt();

if(number > largestNumber){
largestNumber = number;
}
}
System.out.printf("Largest number is: %d", largestNumber);
}

}