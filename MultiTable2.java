import java.util.Scanner;
public class MultiTable2{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

		for(int count = 1; count <= 12; count++){
			for(int index = 1; index<=12;index++){
				int multiply = count *  index ;
						System.out.printf("%d x %d = %d\t", index,  count,  multiply);	


			}
		System.out.println();
		}
	}
}