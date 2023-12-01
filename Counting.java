import java.util.Scanner;

public class Counting{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer and input 0 to end: ");
int number = scanner.nextInt();

int positiveNumber = 0;
int negativeNumber = 0;
int count = 0;
int total = 0;
double average = 0;
int stop = 0;

if(number == 0){
System.out.print("not a number");
}

if(number != 0){
while(number != 0){
System.out.print("Enter a number or 0 to stop: ");
number = scanner.nextInt();

if(number > 0){
positiveNumber++;
}
if(number < 0){
negativeNumber++;
}
total += number;
count++;
}
average = total/count;

System.out.printf("The positive numbers is %d.%n", positiveNumber);
System.out.printf("The negative number is %d.%n", negativeNumber);
System.out.printf("The total is %d.%n", total);
System.out.printf("The average is %.1f.%n", average);
}

}

}

