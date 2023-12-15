import java.util.Scanner;
public class BarChartAsterisk{
public static void main(String... args){
	Scanner scanner  = new Scanner(System.in);

for(int i = 0; i < 5; i++){
System.out.print("Enter a number between 1 and 30: ");
int number =  scanner.nextInt();

if(number >= 1 && number <= 30){
for(int j = 0; j < number; j++){
System.out.print("*");
}
System.out.println();
}
else{
System.out.print("Invalid number! please try again.");
break;
}
}
break;







}







}