import java.util.*;
public class DescendingArray{
public static void main(String... args){
	int[]  array = {1, 2, 4, 5, 4};
System.out.print(Arrays.toString(sortArrayInAscending(array)));
}
public static int[] sortArrayInAscending(int[] numbers){
	int temp = 0;
	for(int count = 0; count < numbers.length; count++){
		for(int index = 0; index<numbers.length; index++){
			if(numbers[index]<numbers[count]){
				temp = numbers[count];
				numbers[count] = numbers[index];
				numbers[index] = temp;
				}
			}
		}
	return numbers;  

	}
}