import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.print("Input string : ");
 	   
	    String str = scn.nextLine();
	   
	    str = str.toLowerCase();
	 
	    int vCount = 0, cCount = 0;  
	    
	    for (int i = 0; i < str.length(); i++) 
	    {
	      
	      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                               || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	        
	        vCount++;
	      }
	    
	      else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
	      {
	        
	        cCount++;
	      }
	    }
	   
	    System.out.println("Number of vowels: " + vCount);
	    System.out.println("Number of consonants: " + cCount);

	}

}
