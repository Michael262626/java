public class LargestArray{
	public static void main(String... args){
	int[] numbers = {2,  3, 1, 7, 8};
	System.out.print(maximumNumber(numbers));
	}
	public static int maximumNumber(int[] number){
	int max = number[0];
	for(int count = 0; count<number.length; count++){
		if(number[count]>max){
			max = number[count];
		}
	}
		return max;

}
}