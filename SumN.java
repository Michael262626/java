import java.util.Scanner;
public class SumN{
	public static void main(String... args){
	Scanner scanner  = new Scanner(System.in);
	
	
	int[] number = new int[5];
	int sum = 0;
	int count = 0;
	
	while(count < 5){
	System.out.print("Enter a number: ");
	number[count] = scanner.nextInt();
	
	sum += number[count];
	count++;
	}
	System.out.print("the sum of ");
	for(int index = 0; index < number.length; index++){
	System.out.print(number[index]+" , ");
	}
	
	//for(int numbers: number){
	//System.out.print(number + " , ");
	System.out.printf("is %s%n", sum);



}




}