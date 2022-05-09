

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColllectionList {

	public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);
        
        
        LinkedList<String> ll = new LinkedList<String>();
        
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
        System.out.println(ll);
        
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);

	}

}
