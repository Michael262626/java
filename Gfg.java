import java.util.Scanner;
public class Gfg{
	public static void main(String... args){
		final int[] arr = {1, 2, 3, 4, 5};
	
		arr[4] = 1;
		for(int count = 0; count < arr.length; count++){
			System.out.println(arr[count]);
		}
	}


}