public class FloorAndCeil {
	public static int myFloor(double num) {
	double max = 1;
	for(int count = 0; count < num.length; count++){
		if(num[count] >= max) {
			max = num[count];
		}
	}
	return max;
	}

	public static int myCeil(double num) {
	double min = 1;
	for(int index = 0; index < num.length; index++) {
		if(num[index] <= min) {
			min = num[index];
		}
	}
	return min;
	}
	public static void main(String... args) {
	double num = {1.0, 2.0, 3.0, 4.0, 5.0};
	
	double result1 = myFloor(numbers);
	double result2 = myCeil(numbers);

	System.out.printf("\nMy floor %.1f", result1);
	System.out.printf("\nMy ceil %.1f", result2);

	
	

	}



}