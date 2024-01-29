import java.util.Scanner;;
public class ReverseArray1{
	public static String reversedArray(int number){
	String convert = number + "";
	String s = "";
	for(int count = convert.length()-1 ; count>=0; count--){
		s += number % 10;
		number /= 10;
		}
	return s;
	}

	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 5 digit number: ");
	int collect = scanner.nextInt();
	System.out.print(reversedArray(collect));
	}
}
	