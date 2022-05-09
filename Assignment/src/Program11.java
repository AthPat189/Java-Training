import java.util.*;

public class Program11 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList<>();

	   
	    names.add("Atharva");
	    names.add("Sudhir");
	    names.add("Patil");
	    System.out.println("ArrayList: " + names);

	   
	    String[] arr = new String[names.size()];

	    
	    names.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    } 

	    
	    String[] array = {"Atharva", "Sudhir", "patil"};
	    System.out.println("Array: " + Arrays.toString(array));

	    
	    List namess= new ArrayList<>(Arrays.asList(array));

	    System.out.println("List: " + namess);

	    
	}

}
