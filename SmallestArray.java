public class SmallestArray{
	public static void main(String... args){
	int[] numbers = {1, 2,67, 12, 45};
	System.out.print(minimumNumber(numbers));
}
public static int minimumNumber(int[] number){
	int min = number[0];
	for(int count = 0; count < number.length; count++){
		if(number[count] < min){
			min = number[count];
		}
	}
	return min;
}


}