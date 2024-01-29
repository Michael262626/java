import java.util.Scanner;

public class BeautifyingString {
	public static String addFullStop (String name) {
		if(name.contains(".")){
			return name;
		}
		else {
			return name + ".";
			}
		}
	public static String toUpperCase(String name) {
		if(name !=null && !name.isEmpty() && !Character.isUpperCase(name.charAt(0))) {
			 char[] chars = name.toCharArray();
			 chars[0] = Character.toUpperCase(chars[0]);
			return new String(chars);
		}
		else {
			return name;
		}
	}
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any words: ");
		String words = scanner.nextLine();

		String check = addFullStop(words);
		String check2 = toUpperCase(check);
		
		System.out.printf("Original: %5s \nModified: %5s ", words, check2);
	}




}