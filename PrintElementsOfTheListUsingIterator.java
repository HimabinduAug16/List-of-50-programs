package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class PrintElementsOfTheListUsingIterator {
	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<String>();
	      al.add("H");
	      al.add("I");
	      al.add("M");
	      al.add("A");
	      al.add("B");
	      al.add("I");
	      al.add("N");
	      al.add("D");
	      al.add("U");
	      System.out.println("Elements in list using iterator:");
	   Iterator<String> iterator = al.iterator();
       while(iterator.hasNext()){
    	   System.out.print(" " +iterator.next());
       }
	
	
	
	
	
	
	}
}