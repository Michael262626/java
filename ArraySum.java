public class ArraySum{
	public static int computeSum(int[] array){
		int sum = 0;
		int count = 0;
		while(count < array.length){
			sum += array[count];
			count++;
		}
		return sum;
	}
public static void main(String... args){
	int[] myArray = {1, 2, 3, 4, 5};
	int sum = computeSum(myArray);
	System.out.println(sum);
	}
}