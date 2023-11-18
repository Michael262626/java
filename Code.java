import java.util.Scanner;

public class Code{

public static void main(String[] args){

Scanner input;
input = new Scanner(System.in);

System.out.println("Enter age:");
int age = input.nextInt();

int ageindays = (age) * 365;

System.out.printf("Age in years %d", ageindays);

}
}