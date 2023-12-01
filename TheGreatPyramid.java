import java.util.Scanner;

public class TheGreatPyramid{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the estimated number of stones:");
int numberOfStones = input.nextInt();

System.out.print("Enter the average weight of each stone:");
int averageWeight = input.nextInt();

System.out.print("Enter the amount of years used to build it:");
int years = input.nextInt();

double estimateValueOfWeight = numberOfStones * 2.5;
System.out.printf("estimated value of weight is %.1f%n",estimateValueOfWeight);

double numberofyears = estimateValueOfWeight / years;
System.out.printf("number of years used is %.1f%n",numberofyears);

double numberofdays = numberofyears / 365;
System.out.printf("number of days used is %.1f%n",numberofdays);

double numberofhours =  numberofdays / 24;
System.out.printf("number of hours used is %.1f%n",numberofhours);

double numberofminutes = numberofhours / 60;
System.out.printf("number of minutes used is %.1f%n",numberofminutes);





}



}