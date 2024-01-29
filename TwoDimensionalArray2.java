public class TwoDimensionalArray2{
	public static void main(String... args){
		int rows = 4;
		int columns = 4;

		int[][] array = new int[rows][columns];
		int value = 1;
		for(int count = 0; count < rows; count++){
			for(int index = 0; index < columns; index++){
				array[count][index] = value; 
				value++;
			}
		}
		System.out.println("The 2D array is: ");
		for(int count = 0; count < rows; count++){
			for(int index = 0; index < columns; index++){
				System.out.print(array[count][index] + " ");
			}
			System.out.println();
		}
	}
}