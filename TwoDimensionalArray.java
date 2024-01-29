public class TwoDimensionalArray{
	public static void main(String... args){
		int rows = 4;
		int columns = 4;

	int[][] array = new int[rows][columns];

	int value = 1;
	for(int index = 0; index < rows; index++){
		for(int count =  0; count < columns; count++){
			array[index][count] = value;
			value++;
		}
	}
	System.out.println("The 2 Dimensional array is: ");
	for(int index = 0; index < rows; index++){
		for(int count = 0; count < columns; count++){
			System.out.print(array[index][count] + " ");
		}
		System.out.println();
	}
}
}
