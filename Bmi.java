import java.util.Scanner;

public class Bmi{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of weight:");
int weight = input.nextInt();

System.out.print("Enter the value of height:");
int height = input.nextInt();

int bmi = (weight * 703) / (height * height);
System.out.printf("Bmi is %d%n", bmi);

if(bmi < 18.5)
System.out.println("under weight");

if(bmi >= 18.5 || bmi < 24.9)

System.out.println("normal weight");

if(bmi == 25 && bmi > 30)
System.out.println("over weight");

if(bmi > 30)
System.out.println("obesity");







}

}