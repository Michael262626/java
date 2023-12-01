import java.util.Scanner;

public class WorldPopulationGrowth{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter the current population growth rate:");
long currentpopulation = input.nextLong();

System.out.print("Enter the annual population growth rate:");
double annualrate = input.nextDouble();

double currentYear = (currentpopulation + currentpopulation * (annualrate / 100));
double year1 = currentYear + (currentpopulation * (annualrate / 100));
double year2 = (year1 + currentpopulation * (annualrate / 100));
double year3 = (year2 + currentpopulation * (annualrate / 100));
double year4 = (year3 + currentpopulation * (annualrate / 100));
double year5 = (year4 + currentpopulation * (annualrate / 100));

System.out.printf("The current population is %.2f%n", currentYear);
System.out.printf("The population after 1 year is %.2f%n", year1);
System.out.printf("The population after 2 year is %.2f%n", year2);
System.out.printf("The population after 3 year is %.2f%n", year3);
System.out.printf("The population after 4 year is %.2f%n", year4);
System.out.printf("The population after 5 year is %.2f%n", year5);

 



}

}