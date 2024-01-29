public class IntArray{
	public static void main(String... args){
		int[] array = new int[10];
		System.out.printf("%s%8s%n", "Index", "Value");

		for(int count = 0; count < array.length; count++){
			System.out.printf("%5d%8d%n", count, array[count]);
		}
	}
}