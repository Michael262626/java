public class RunningTotal{
	public static int[] totalNumbers(int[] numbers){
	int[] totalNumbers = new int[numbers.length];
	int total = 0;	
		for(int count = 0; count < numbers.length; count++){
		total+=numbers[count];
		totalNumbers[count] = total;
		}
		return totalNumbers;

	}






}