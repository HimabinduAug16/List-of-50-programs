package arrays;

import java.util.Arrays;
public class LinearSearch {
	


	

	public static void main(String[] args) {
		
		String [] name = {"h", "i", "m", "a", "b", "i", "n", "d", "u"};
	    System.out.println("My name is = " +Arrays.toString(name));
	    
	    String key = "i";
	   	    
	    for(int i = 0; i<name.length; i++){   // i = index of the element to be find
	     if(name[i] == key){
	    	System.out.println("Element found at index: "+i);
	    	
	    }
	    
	    }
	    
	   
	    

	}

}
