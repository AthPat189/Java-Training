
interface C{  
	
  default void msg(){
	  System.out.println("Hello");}  //default modifier is accessible only within package
}  

class A{  
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");}  //private access modifier is accessible only within the class.
	}  

class B{  
protected void msg1(){System.out.println("Hello");}  //protected access modifier is accessible within package and outside the package but through inheritance only
}  
public class AccessModifier extends B implements C {
	
	public void msg()
    {     
        C.super.msg();
    }
	
	

	public static void main(String[] args) {
		
		 B obj = new B();  
		   obj.msg1();  
		   
		   
		  
		   
		   }  

	

}
