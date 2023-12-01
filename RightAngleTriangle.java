import java.util.Scanner;
public class RightAngleTriangle{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the length of the triangle: ");
	int length = scanner.nextInt();
	for(int i = 0; i < length; i++){
	for(int j = 0; j < i; j++){
	System.out.print("*");
	}
	System.out.println();
	}





}




}