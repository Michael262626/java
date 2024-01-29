import java.util.Scanner;
public class StudentGrade{
public static void main(String... args){
Scanner scanner  = new Scanner(System.in);
int countA = 0, countB =0, countC = 0, countD = 0;

for(int count = 1; count <=5; count++){
System.out.print("Enter student name: ");
String name = scanner.nextLine();
System.out.print("Enter student grade: ");
String grade  = scanner.nextLine();
switch(grade){
case "A":
countA++;
break;
case "B":
countB++;
break;
case "C":
countC++;
break;
case "D":
countD++;
break;
}

}

System.out.println("Number of students with grade A:" +countA);
System.out.println("Number of students with grade B:" +countB);
System.out.println("Number of students with grade C:" +countC);
System.out.println("Number of students with grade D:" +countD);


}

}



