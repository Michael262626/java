import java.util.Scanner;
public class Absolute{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();

	int absolute = 0;

	if(number < 0){
	absolute = number * -1;
	System.out.printf("Absolute number is %d", absolute);
	}

	else if(number >= 0){
	absolute = number;
	System.out.printf ("Absolute number is %d", number);
	}

}
}