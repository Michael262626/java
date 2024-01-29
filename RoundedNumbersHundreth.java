public class RoundedNumbersHundreths {
 	public static double roundingNumbers(double num){
		double value = 30.456;
		 
		double result = Math.floor(value * 100 + 0.5) / 100;
	
		return result;
}
public static void main(String... args){
	double num = 30.456;
	double output = roundingNumbers(num);
System.out.printf("%.2f is the original value while %.2f is the rounded value", num, output);

}





}