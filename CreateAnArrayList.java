package collections;

import java.util.ArrayList;



public class CreateAnArrayList {
	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<String>();
	
		  al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add("G");
	      
	      System.out.println("Elemnts in ArrayList al: " +al);
          al.remove(3);
	
System.out.println("New array list: " +al);	
	}
}
