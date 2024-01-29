public class PalindromeNumbers {
	public static boolean isPalindrome(String number) {
	String check = "";
	for(int count = number.length() - 1; count >= 0; count--) {
			check += number.charAt(count);	
	}
	if(number.equalsIgnoreCase(check)){
		return true;
	}
	else{
		return false;
	}
}
	public static void main(String... args) {
	String checkIfPalindrome = "123321";
	
	boolean result  = isPalindrome(checkIfPalindrome);
	System.out.printf("%s", result);

	}






}



