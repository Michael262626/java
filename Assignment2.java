import java.util.Scanner;

public class Assignment2{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number or -1 to end: ");
int number = scanner.nextInt();

int positiveNumber = 1;
int negativeNumber = 0;
int count = 1;
int zeros = 0;

while(number != -1){
System.out.print("Enter a number or -1 to stop: ");
number = scanner.nextInt();

if(number > 1){
positiveNumber++;
}
if(number < -1){
negativeNumber+=1;
}
if(number == 0){
zeros++;
}
count++;
}
System.out.printf("The positive numbers is %d.%n", positiveNumber);
System.out.printf("The negative number is %d.%n", negativeNumber);
System.out.printf("The zeros number is %d.%n", zeros);


}

}

