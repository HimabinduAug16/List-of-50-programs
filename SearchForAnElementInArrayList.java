package collections;

import java.util.ArrayList;

public class SearchForAnElementInArrayList {
	
	public static void main (String [] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Android");
		al.add("Bluetooth");
		al.add("Collections");
		al.add("Database");
		al.add("Eclipse");
		
		// search for an element if it is present or not using boolean method
		
		boolean b = al.contains("Eclipse");
		System.out.println("Is Eclipse present ? " +b);
		 int i = al.indexOf("Eclipse");
	        if(i!=0){
		System.out.println("Array list contains Eclipse at index " +i+ ".");
		al.remove("Database");
		boolean b1 = al.contains("Database");
		System.out.println("Is database present ? " +b1);
       int j = al.indexOf("Eclipse");
        if(j!=0){
	System.out.println("Array list contains Eclipse at index " +j+ ".");
}
}
}
}
