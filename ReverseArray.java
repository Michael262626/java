import java.util.*;
public class ReverseArray1{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	int[] numbers = new int[5];
	for(int count = 0; count<number.length; count++){
		System.out.print("Enter 5 digit number: ");
		numbers[count] = scanner.nextInt();
	}
	System.out.print(reversedArray(numbers));
}
	public static int[] reversedArray(int[] numbers){
	int temp = 0;
	for(int count = 0;count < numbers.length; count++){
		for(int index = 0; index<numbers.length; index++){
			temp = numbers[count];
			numbers[count] = numbers[index];
			numbers[index] = temp;
		}
	}
	return numbers;
	}
}
	