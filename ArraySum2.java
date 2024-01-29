public class ArraySum2{
	public static int computeSum(int[] array){
	int sum = 0;
	int count = 0;
		do{
			sum += array[count];
			count++;
		}
		
		while(count < array.length);
		return sum;
	}
public static void main(String... args){
	int[] myArray = {1, 2, 3, 4, 5};
	int sum = computeSum(myArray);
	System.out.println(sum);
	}
}