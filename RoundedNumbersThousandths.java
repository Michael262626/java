public class RoundedNumbersThousandths {
 	public static double roundingNumbers(double num){
		double value = 30.456;
		 
		double result = Math.floor(value * 1000 + 0.5) / 1000;
	
		return result;
}
public static void main(String... args){  
	double num = 30.456;
	double output = roundingNumbers(num);
System.out.printf("%.2f is the original value while %.2f is the rounded value", num, output);

}





}