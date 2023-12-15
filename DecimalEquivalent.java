import java.util.Scanner;
public class DecimalEquivalent{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);


int count =  0;
int decimalEquiv = 0;
int even = 0;
while(even < 5){
if(even % 2 == 0){
System.out.print("Enter an integer containing o & 1: ");
int number = scanner.nextInt();
even*=number;
int number1 = number / 1000;
int remainder = number % 1000;
int number2 = remainder / 100;
int remainder1  = remainder % 100;
int number3 = remainder1 / 10;
int number4 = remainder1% 10;
count++;
decimalEquiv= (number4*even + number3 *  even + number2 * even + number1 * even);
}
System.out.printf(" %d",  decimalEquiv);
}






}







}