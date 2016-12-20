package arrays;

import java.util.Arrays;
//import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String [] args){
		
		int [] a = {1,3,5};
		System.out.println("The first array a = " +Arrays.toString(a));
		int [] b = {2,4,6};
		System.out.println("The second array b = " +Arrays.toString(b));
	   int [] c = new int[a.length+b.length];
		for(int i = 0;i<a.length;i++){
	    for(int j = 0; j<b.length; j++){
	    c[i] = a[i];
	    c[j+b.length] = b[j];
	    }
	    }
	    
	    System.out.println("The merged unsorted array = " +Arrays.toString(c));
	    Arrays.sort(c);
	    System.out.println("The merged sorted array = " +Arrays.toString(c));
	    
	
	    
	  
	
	}
	    }
