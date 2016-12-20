package arrays;

import java.util.Arrays;

public class SwapElementsUnsorted {

	public static void main(String[] args) {
	int [] a= {1,3,5,7,9};    // Array declaration
	
	System.out.println("Before swapping.");
	System.out.println("a = " +Arrays.toString(a));  // i want to swap elements 5 and 9 can be done by indexing by using temporary element.
	int i = 2; // index 2
	int j = 4;  // index 4
	int k;
	// method to define and relocate elements in array
	k = a[i];
	a[i] = a[j];
	a[j] = k;
	System.out.println("After swapping");
	for(int s=0; s<a.length; s++); // s denotes swapping
	System.out.println("a = " +Arrays.toString(a));
		
	}
}
