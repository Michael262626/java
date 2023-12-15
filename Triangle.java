<<<<<<< HEAD
import java.util.Scanner;

public class Triangle{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter a number of edges:");
	int edge1 = input.nextInt();
	
	System.out.print("Enter a number of edges:");
	int edge2 = input.nextInt();

	System.out.print("Enter a number of edges:");
	int edge3 = input.nextInt();

	int perimeter = edge1 + edge2 + edge3;

	if(edge1 + edge2 > edge3)

	{System.out.println("valid");}

	else
	{System.out.println("invalid");}

	if(edge2 + edge3 > edge1)
	{System.out.println("valid");}

	else
	{System.out.println("invalid");}

	if(edge1 + edge3 > edge2)
	{System.out.println("valid");}

	else
	{System.out.println("invalid");}


	

	
}

=======
import java.util.Scanner;

public class Triangle{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter a number of edges:");
	int edge1 = input.nextInt();
	
	System.out.print("Enter a number of edges:");
	int edge2 = input.nextInt();

	System.out.print("Enter a number of edges:");
	int edge3 = input.nextInt();

	int perimeter = edge1 + edge2 + edge3;

	if(edge1 + edge2 > edge3)

	{System.out.println("valid");}

	else
	{System.out.println("invalid");}

	if(edge2 + edge3 > edge1)
	{System.out.println("valid");}

	else
	{System.out.println("invalid");}

	if(edge1 + edge3 > edge2)
	{System.out.println("valid");}

	else
	{System.out.println("invalid");}


	

	
}

>>>>>>> c0356171e35109969cfae8ac6d3290760408b77f
}