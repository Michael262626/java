public class Gfg2{
	public static void main(String... args){
	int[] arr;
	arr = new int[5];

	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;

		for(int count = 0; count < arr.length; count++){
			System.out.println("Elements at index " + count + ": " +arr[count]);
		}
	}
}