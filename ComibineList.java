public class CombineList{
	public static void main(String... args){
	int[] list1 = [1, 2, 3];
	int[] list2 = [2, 4, 6];
	int[] conacatenatedArray = concatenateArrays(list1, list2);
	for(int value : concatenatedArray){
		System.out.print(value + " ");
	}
}
public static int[] concatenatesArrays(int[] list1, int[] list2){
	int length1 = list1.length;
	int length2 = list2.length;
	int[] concatenatedArray = new int[length1 + length2];

	System.arraycopy(array1, 0, concatenatedArray, length1);
	System.arraycopy(array2, 0, concatenatedArray, length1, length2);

	return concatenatedArray;

	}
}