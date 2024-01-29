public class SumFl{
	public static int computeSum(int[] array){
		int sum = 0;
		for(int count = 0; count < array.length; count++){
			sum += array[count];
		}
		return sum;
	}
public static void main(String... args){
	int[] myArray = {1, 2, 3, 4, 5};
	int sum = computeSum(myArray);
	System.out.println(sum);
	}
}
