public class PalindromeList{
	public static boolean isPalindrome(String str){
		for(int count = 0; count < str.length() / 2; count++){
			if(str.charAt(count) != str.charAt(str.length() -1 - count)){
				return false;
			}
		} 
			return true;
	}
}