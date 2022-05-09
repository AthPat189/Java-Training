import java.util.Scanner;


public class Program26 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

	    
	    System.out.print("Enter a String: ");
	     
	    String str = in.nextLine();
	    
        splitString(str);
        
        
	}
	
	 static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
        num = new StringBuffer(), special = new StringBuffer();
         
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
      
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }

}
