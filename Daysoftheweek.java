import java.util.Scanner;

public class Daysoftheweek{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the year:");
int year = input.nextInt();

System.out.print("Enter the month 1-12:");
int month = input.nextInt();

System.out.print("Enter the days of the month 1-31:");
int days = input.nextInt();


int century = year / 100;
int yearofthecentuary = year % 100;

int weeks = (days + 26 * (month + 1) / 10 + yearofthecentuary + yearofthecentuary / 4 + century / 4 + 5 * century) % 7;


if(days == 0);
System.out.print("Days of the week is saturday");
if(days == 1)
System.out.print("Days of the week is sunday");
if(days == 2)
System.out.print("Days of the week is monday");
if(days == 3)
System.out.print("Days of the week is tuesday");
if(days == 4)
System.out.print("Days of the week is wednesdy");
if(days == 5)
System.out.print("Days of the week is thursday");
if(days == 6)
System.out.print("Days of the week is friday");











}















}