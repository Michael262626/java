import java.util.Scanner;
public class Pass{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	int pass = 0;
	int fail = 0;
	int count = 0;
	
	while(count < 10){
	System.out.print("Enter the exam result (num1 = pass) (num2 = fail): ");
	int result = scanner.nextInt();

	if(result == 1){
	pass++;
	}
	else{
	fail++;
	}

	count++;
	}
	System.out.println("The number of pass is " +pass);

	System.out.println("The number of fail is" +fail);


	if(pass > 8){
	System.out.println("Bonus to instructor!!!");
	}





}






}