import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		int num;
	    System.out.println("Enter an Integer number:");

	   
	    Scanner in = new Scanner(System.in);
	    num = in.nextInt();

	   
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");

	}

}
