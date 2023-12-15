import java.util.Scanner;
public class Extremes{
public static void main(String...  args){
Scanner scanner = new Scanner(System.in);
int max = 1;
int min = 1;
System.out.println("Enter 5 numbers: ");

for(int count = 1; count <=5; count++){
int number = scanner.nextInt();
if(number > max){
max = number;
}
if(number < max){
min = number;
}
}
int sum = max + min;

System.out.printf("\nMaximum number is %d", max);

System.out.printf("\nMinimum number is %d", min);
System.out.printf("\nSum of minimum & maximum is %d",  sum);



}




}