import java.util.Scanner;
public class StudentGrade{
public static void main(String... args){
Scanner scanner  = new Scanner(System.in);
System.out.print("Enter student name: ");
System.out.print("Enter student grade: ");
for(int count = 1; count <=5; count++){
String name = scanner.nextLine();
int grade  = scanner.nextInt();
if(grade > 100 || grade < 30)
System.out.print("\nSee me\nimmediately");
else{
switch(grade){
case (1):
if(grade >= 75){
System.out.print("A");
}
break;
case (2):
if(grade <= 70){
System.out.print("B");
}
break;
case (3):
if(grade <= 65){
System.out.print("C");
}
break;
if(grade <= 55){
System.out.print("D");
}
break;
}
}

}
}


}



