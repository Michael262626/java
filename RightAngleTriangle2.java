import java.util.Scanner;
public class RightAngleTriangle2{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);
int j = 0;
int i = 0;
int count = 1;
System.out.print("Enter length: ");
int length = scanner.nextInt();

while(count <= length){
if(i<length){
i++;
if(j<=i){
j++;
count++;
}
System.out.print("*");
}
System.out.println();
}
}
}
