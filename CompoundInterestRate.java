public class CompoundInterestRate{
public static void main(String... args){
double principal = 1000;
int years = 5;
for(int rate = 5; rate <= 10; rate++){
double interestRate = rate / 100.0;
double amount = principal * Math.pow(1+interestRate, years);
double interest = amount - principal;
System.out.printf("At an interest rate of %d%%, the amount after %d years will be $%.2f with an interest of $%.2f.%n", rate,years,amount, interest);
}







}





}