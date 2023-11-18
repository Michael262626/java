import java.util.Scanner;

public class NumberOfDaysInMonth{

public static void main(String[] args){

Scanner input;
input = new Scanner(System.in);

System.out.print("Enter a month in number:");
int month = input.nextInt();

System.out.print("Enter a year");
int year = input.nextInt();


if(month == 1){System.out.printf("january %d had 31 days", year);}

if(month == 2){System.out.printf("february %d had 29 days", year);}

if(month == 3){System.out.printf("march %d had 31 days", year);}

if(month == 4){System.out.printf("april %d had 30 days", year);}

if(month == 5){System.out.printf("may %d had 31 days", year);}

if(month == 6){System.out.printf("june %d had 30 days", year);}

if(month == 7){System.out.printf("july %d had 31 days", year);}

if(month == 8){System.out.printf("august %d had 31 days", year);}

if(month == 9){System.out.printf("september %d had 30 days", year);}

if(month == 10){System.out.printf("october %d had 31 days", year);}

if(month == 11){System.out.printf("november %d had 30 days", year);}

if(month == 12){System.out.printf("decmber %d had 31 days", year);}
}
}
