public class SquareOfCharacter{
	public static void  Astericks(char num){

		for(int count = 0; count < 5; count++){
			for(int  index = 0; index < 5; index++){
				System.out.print('#');
			}
			System.out.println();
		}
	}
	public static void main(String... args){
		char number = '5';
		Astericks(number);
	}
	
}