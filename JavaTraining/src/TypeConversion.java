
public class TypeConversion {

	public static void main(String[] args) {
		
		// Widening Casting
		
		int myInt = 9;
	    double myDouble = myInt; 

	    System.out.println(myInt);      
	    System.out.println(myDouble);   
	    
	    // Narrowing Casting
	    
	    double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble; 

	    System.out.println(myDouble1);   
	    System.out.println(myInt1);     
	    
	    
	   // TypeConversion
	    
	    
        double d = 100.04;
 
        long l = (long)d;
 
        
        int i = (int)l;
 
       
        System.out.println("Double value " + d);
 
        System.out.println("Long value " + l);
 
       
        System.out.println("Int value " + i);
	}

}
