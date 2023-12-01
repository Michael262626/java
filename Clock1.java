import java.util.Scanner;

public class Clock1{

public static void main(String [] args){

Clock clock = new Clock(3, 20, 10);

Scanner scanner = new Scanner(System.in);

System.out.print("Enter hours:");
int hours = scanner.nextInt();
clock.setHours(hours);

System.out.print("Enter minutes:");
int minutes = scanner.nextInt();
clock.setMinutes(minutes);

System.out.print("Enter seconds:");
int seconds = scanner.nextInt();
clock.setSeconds(seconds);

System.out.printf("Time is : %d:%d:%d%n%n", clock.getHours(), clock.getMinutes(), clock.getSeconds());











}



}