import java.util.Scanner;

public class Sum
{
public static void main(String[] args)
{

Scanner input;
input = new Scanner(System.in);

System.out.println("Enter an integer");
int number = input.nextInt();

if(number % 5 == 0 && number % 6 == 0 )
{
System.out.printf("is %d divisible by 5 and 6?", true);
}
else if(number % 5 != 0 || number % 6 != 0)
{
System.out.println("false");
} 

if(number % 5 == 0 || number % 6 == 0)
System.out.printf("is %d divisible by 5 or 6?", true);

else
{
System.out.printf("is %d false");
}

}
}