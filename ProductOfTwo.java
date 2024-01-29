import java.util.Scanner;
public class ProductOfTwo{
	public static void	main(String... args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a two numbers: ");
	int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
System.out.println(getProduct(number1, number2));
		
}
	public static int getProduct(int number1, int number2){
		int product = 0;
		for(int count = 0; count < number2; count++){
			product += number1;
		}
		return product;
	}



}