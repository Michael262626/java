public class SquareOfAstericks{
	public static void  Astericks(int num){

		for(int count = 0; count < num; count++){
			for(int  index = 0; index < num; index++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String... args){
		int number = 5;
		Astericks(number);
	}
	
}