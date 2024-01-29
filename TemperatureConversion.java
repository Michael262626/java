import java.util.Scanner;
public class TemperatureConversion {
	private static Scanner scanner = new Scanner(System.in );

	public static double celciusToKelvin(double celcius){
	double kelvin = celcius +  273.15;
	
	return kelvin;
	}

	public static double kelvinToCelcius(double kelvin) {
	double celcius = kelvin - 273.15;
	return celcius;
	}
	public  static double removeLastChar(String input){
		int length = input.length()-1;
		String valueNeeded = "";
			for(int count = 0;count<length;count++){
				valueNeeded +="" +  input.charAt(count); 
			}
		return Double.parseDouble(valueNeeded);

	}
	public static void collectInput(){
		System.out.print("Enter temperature in kelvin(e..g 23.50k) or celcius (23.55c) to convert from kelvin to celcius or vice-versa: ");
	String userInput = scanner.nextLine();
	int length = userInput.length()-1;
	String character =""+userInput.charAt(length);
	String lastChar = character.toUpperCase();
		double result = 0;
		double mainResult = 0;
		if(lastChar.equals("K")){
			result = removeLastChar(userInput);
			System.out.println(result);
			 mainResult = kelvinToCelcius(result);
			System.out.printf("%.2f kelvin  to clecius is %.2f ",result ,mainResult);
	}
		else if(lastChar.equals("C")){
			result = removeLastChar(userInput);
			mainResult = celciusToKelvin(result);
			System.out.printf("%.2f kelvin  to clecius is %.2f ",result ,mainResult);
		}else{
				System.out.println("You Have Entered Wrong Unit Retry ");
		}
		
	}

	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	
		collectInput();
	

	}

}