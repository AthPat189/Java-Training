import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		 Scanner in =new Scanner(System.in);

		    
		    System.out.print("Enter a Sentence: ");
		    String sentence = in.nextLine();

		    
		    String reversed = reverse(sentence);

		    
		    System.out.print("Reverse: ");
		    System.out.println(reversed);
		  }

		  public static String reverse(String str){
		    int idx = str.indexOf(" ");
		   
		    if(idx == -1)
		      return str;
		    
		    
		    return reverse(str.substring(idx+1)) +" "+ str.substring(0, idx);

	}

}
