import java.util.Scanner;
public class Sphere {
	public static void main(String... args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter radius: ");
	double radius = scanner.nextDouble();
	
	System.out.printf("Volume is %f%n", sphereVolume(radius));
	}

public static double sphereVolume(double radius) {
double result  = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
return result;
}


}