import java.util.Scanner;
public class GasMileage{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter miles driven or enter -1 to end: ");
	int miles = scanner.nextInt();
	int totalMiles = 0;
	int totalGallon = 0;
	double totalMilesPerGallon = 0;
	double milesPerGallon = 0;	

	while(miles != -1){
	
	System.out.print("Enter the number of gallon used or enter -1 to end: ");
	int gallon = scanner.nextInt();
	
	totalMiles+= miles;
	totalGallon+= gallon;
	milesPerGallon = miles/gallon;

	System.out.printf("Miles per gallon is %.1f%n", milesPerGallon);
	

	System.out.print("Enter miles driven or enter -1 to end: ");
	miles = scanner.nextInt();
	 
	}
	
	totalMilesPerGallon = totalMiles / totalGallon;
	System.out.printf("The total miles per gallon used is %.2f", totalMilesPerGallon);	
}
}