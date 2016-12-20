package collections;

import java.util.ArrayList;


public class CoptArrayListToArray {


public static void main(String [] args){
	ArrayList<String> al = new ArrayList<String>();

	  al.add("Carrot");
      al.add("Apple");
      al.add("Egg");
      al.add("Broccoli");
      al.add("Doughnut");
      al.add("Fish");
      al.add("Grapes");
      System.out.println("Elements in ArrayList al: " +al);
      System.out.println("Array:");
     String [] s = new String[al.size()];
     al.toArray(s);
     for(String str:s){
    	 System.out.println(str);
     }
      


}
}