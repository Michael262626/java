public class OddList{
	public  static int[] OddNumbers(int[] arr){
		int[] oddElements = new int[(arr.length+1)/2];
		int index = 0;
for(int num = 0; num < arr.length; num+=2){
		oddElements[index] = arr[num];
		index++;
	}
return oddElements;
	}
}