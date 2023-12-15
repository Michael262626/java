import java.util.Scanner;
public class TwoLargestNumbers{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);
int count = 1;
int largest1 = 0;
int largest2 = 0;
System.out.println("Enter a number: ");
int number = scanner.nextInt();
while(count < 10){
number = scanner.nextInt();
if(number>=largest1){
largest1=number;
largest2=largest1;
}
if(number > largest2){
largest2 = largest1;
}

count++;
}
System.out.printf("\nthe first largest is %d the second largest is %d", largest1, largest2);





}
}
