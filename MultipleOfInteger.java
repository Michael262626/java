public class MultipleOfInteger {
	public static boolean isMultiple(int num1, int num2){
	if(num2 % num1 == 0){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String... args) {
	int num1 =  10;
	int num2 = 2;
	boolean result = isMultiple(num1, num2);

	System.out.printf("%s", result);
	}



}