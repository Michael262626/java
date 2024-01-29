import java.util.Scanner;
public class TemperatureConversion {
	public static double celciusToKelvin(double celcius){
	double kelvin = celcius + 273.15;
		
	return kevin;
	}
	public static double kelvinToCelcius(double kelvin) {
	double celcius = kelvin - 273.15;
	return celcius;
	}
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a value adding k to convert from celcius to kelvin or adding c to convert vice-versal: ");
	doule userInput = scanner.nextInt();

	double check = celciusToKelvin(userInput);
	double check2 = kelvinToCelcius(userInput);

	if(userInput.contains.ignoreCase("k"){
		System.out.print(check);
	}
	else if(user.input.conatains.ignoreCase("c"){
		System.out.print(check2);
	}
	else {
		System.out.print("Invalid value");
	}

	}

}