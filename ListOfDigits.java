public class ListOfDigits{
	public static int[] returnDigits(int number){
	int count = 0;
	int temp = number;
	while(temp != 0){
		count++;
		temp /= 10;
	}
	int[] digits = new int[count];
	for(int i = count - 1; i >= 0; i--){
		digits[i] = number % 10;
		number /= 10;
	}
	return digits;
}
}