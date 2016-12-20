package collections;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class ElementsInReverseOrderUsingListIterator {
	public static void main(String [] args){
		List<String> al = new ArrayList<String>();
	    
		  al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("A");
	      al.add("E");
	      al.add("P");
	      al.add("C");
	      
	      System.out.println("Elements in ArrayList al: " +al);
	     
        System.out.print("Elements in reverse order using list iterator:");
        //List<String> ls = new ArrayList<String>();
        ListIterator<String> listIterator = al.listIterator(al.size());

        while(listIterator.hasPrevious()){
          System.out.print(" " +listIterator.hasPrevious());
       
         
        }
	
  
        
	}
	

}
