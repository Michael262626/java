import java.util.Scanner;
public class MultiTable{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a numbere you want the multiplication table of: ");
		int number = scanner.nextInt();
		if(number <= 0 || number > 10){
		System.out.print("Why are you wicked :( re-enter number in the range 1 - 10");
		number = scanner.nextInt();
		}
		int multiply = 0;
		for(int count = 1; count <= 12; count++){
			 multiply = number*count;

		System.out.printf("%d x %d = %d%n",number, count, multiply);

}


}
}