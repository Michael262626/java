import java.util.Scanner;
public class Main1{
	public static void main(String... args){
		Scanner scanner  = new Scanner(System.in);
	
		System.out.print("Enter number or rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter number of columns: ");
		int column = scanner.nextInt();

		int[][] multidimenisionalArray = new int[rows][column];
	
		for(int index = 0; index < rows; index++){
			for(int count = 0; count < column; count++){
				multidimenisionalArray[index][count] = (index + 1) * (count + 1);
			}
		}
		for(int index = 0; index < rows; index++){
			for(int count = 0; count < column; count++){
				System.out.print(multidimenisionalArray[index][count]+ " ");
			}
			System.out.println();
		}
	}

}