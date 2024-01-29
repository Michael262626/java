import java.util.ArrayList;
public class CheckDuplicate {
	public static void ifDuplicate(String[] fruits) {
	ArrayList<String> fruit = new ArrayList<>();
	for(int count = 0; count < fruits.length; count++){
		for(int index =  count; index <  fruits.length; index++) {
			if(fruits[count] == fruits[index]) {
				fruit.add(fruits[index]);
				System.out.printf("%s it has a duplicate", fruits[count]);
			}
		}
				System.out.print("it has no duplicate");
		}
	}
	public static void main(String... args) {
	String[] fruits = {"apple", "mango", "apple", "banana"};
	ifDuplicate(fruits);




	}



}