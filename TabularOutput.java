import java.util.Scanner;
public class TabularOutput{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);
int count = 0;
int square = 0;
int number = 0;
int triple = 0;
int quadriple = 0;
System.out.print("N\tN2\tN3\tN4\n");
while(number < 5){

number++;
square = number * number;
triple = number * number * number;
quadriple = number * number * number * number;
count++;

System.out.printf("%d\t%d\t%d\t%d",number, square, triple, quadriple);

System.out.println();
}






}












}
