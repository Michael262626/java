import java.util.Scanner;
public class Lettergrades{
public static void main(String... args){
int total = 0;
int counter = 0;
int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countF = 0;

Scanner scanner = new Scanner(System.in);

System.out.printf("%s%n%s%n", "Enter the integer grade in the range 0-100.","then type <ctrl >z and press enter to terminate");
while(scanner.hasNext()){
int grade = scanner.nextInt();
total += grade;
counter++;
switch (grade/10){
	case 9:
	case 10:
	countA++;
	break;
	case 8:
	countB++;
	break;
	case 7:
	countC++;
	break;
	case 6:
	countD++;
	break;
	default:
	countF++;
}
}
System.out.printf("%nGrade Report:%n");
if(counter != 0){
	double average = (double) total / counter;
System.out.printf("Total of the %d grades entered is %d%n",  counter, total);
System.out.printf("Class average is %.2f%n", average);
System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:", "A: ", countA, "B: ", countB, "C: ", countC, "D: ",countD, "F: ", countF);
}
else{
	System.out.println("No grades were entered");
}
}



}