

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int temp;
		boolean p=true;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number:");
	
		int num=s.nextInt();
	        s.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      p=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(p)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");

	}

}
