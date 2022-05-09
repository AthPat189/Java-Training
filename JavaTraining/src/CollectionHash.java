

import java.util.*; 

public class CollectionHash {

	public static void main(String[] args) {
		
		 HashSet<String> set = new HashSet<String>();  
         set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");  
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
         
         HashMap<Integer,String> map=new HashMap<Integer,String>();  
         map.put(1,"Mango");  
         map.put(2,"Apple");    
         map.put(3,"Banana");   
         map.put(4,"Grapes");   
             
         System.out.println("Iterating Hashmap...");  
         for(Map.Entry m : map.entrySet()){    
          System.out.println(m.getKey()+" "+m.getValue());    
         }  
         
         

	}

}
