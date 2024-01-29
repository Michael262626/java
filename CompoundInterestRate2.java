import java.util.Scanner;
public class CompoundInterestRate2{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

for(int rate = 5; rate <= 10; rate++){
System.out.print("Enter the principal amount(in pennies): ");
int principal = scanner.nextInt();

System.out.print("Enter the number of years");
int years = scanner.nextInt();

double interestRate = rate / 100.0;
double C0mpoundInterest = principal * Math.pow(1+(interestRate / rate),rate * years);
int dollars = (int)(C0mpoundInterest / 100);
int cents = (int)(C0mpoundInterest % 100);

System.out.println("Compound interest: $" +dollars+"." +cents);
}
}
}
