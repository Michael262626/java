import java.util.Scanner;

public class FindLargestNumber{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for (int count = 0; count < numbers.length; count++){
			System.out.print("Enter a number: ");
			numbers[count] = scanner.nextInt();
		}
}
	public static int findLargestNumber(int[] numbers){

		int max = numbers[0];
		
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] > max){
				max = numbers[count];
			}

		}

			return max;
	}
}

