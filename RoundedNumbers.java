public class RoundedNumbers {
 	public static double roundingNumbers(double num){
		double value = 3.4;
		 
		double result = Math.floor(value + 0.5);
	
		return result;
}
public static void main(String... args){
	double num = 3.4;
	double output = roundingNumbers(num);
System.out.printf("%.2f is the original value while %.2f is the rounded value", num, output);

}





}