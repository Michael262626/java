public class HypotenusCalculation {
	public static double Hypotenus(double side1, double side2) {
	
	double square1 = Math.pow(side1, side1);
	double square2 = Math.pow(side2, side2);

	double hypotenus = Math.sqrt(square1 + square2);

	return hypotenus;
	}

	public static void main(String... args) {
	double sides = 3.0;
	double sides2 = 4.0;

	double result = Hypotenus(sides, sides2);
	System.out.printf("Hypotenus of the two sides is: %.2f", result);
	}
}