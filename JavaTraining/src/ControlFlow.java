
public class ControlFlow {

	public static void main(String[] args) {
		
		int x = 10;    
		int y = 12;  
		
		// if statement
		
		if(x+y > 20) {    
		System.out.println("x + y is greater than 20");    
		}    
		
		//if else statement
		
		if(x+y < 10) {  
			System.out.println("x + y is less than 10");  
			}   
		else {  
			System.out.println("x + y is greater than 20");  
			}  
		
		//if else if ladder
		
		String city = "Delhi";  
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}
		else if (city == "Noida") {  
		System.out.println("city is noida");  
		}
		else if(city == "Agra") {  
		System.out.println("city is agra");  
		}
		else {  
		System.out.println(city);  
		}  
		
		// switch statement
		int num = 2;  
		switch (num){  
		case 0:  
		System.out.println("number is 0");  
		break;  
		case 1:  
		System.out.println("number is 1");  
		break;  
		default:  
		System.out.println(num);  
		}  
		
		// for loop 1
		
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum  is " + sum); 
		
		// for loop 2
		
		String[] names = {"AAA","BBB","CCC","DDD","EEE"};    
		System.out.println("Printing the array :\n");    
		for(String name:names) {    
		System.out.println(name);    
		}    
		
		
		//  while loop
		
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}    
		
		//  do while loop
		
		int j = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(j);    
		j = j + 2;    
		}while(j<=10);
		
		// break
		
		for (int i1 = 0; i1 < 10; i1++) {
			  if (i1 == 4) {
			    break;
			  }
			  System.out.println(i1);
			}
		
		//continue
		
		for (int i1 = 0; i1 < 10; i1++) {
			  if (i1 == 4) {
			    continue;
			  }
			  System.out.println(i1);
			}
		
		}      
	
	    
		  

	}

