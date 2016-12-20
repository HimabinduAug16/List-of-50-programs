package arrays;

import java.util.Arrays;


public class CommonNumbers {

	public static void main(String[] args) {
		/*To find the common numbers in array first initialize two arrays 
		 * Then give numbers to the arrays
		 * Use for loop to find the common elements
		 * then print
		 */
        int [] a = {1,4,5,6,7,8,18,14};
        int [] b = {4,6,8,7,18,12,16,1,14};
    	Arrays.sort(a);
		Arrays.sort(b);
		int i;
		int j;
         for( i = 0; i<a.length; i++){
			for(j = 0; j<b.length; j++){
			 if(a[i] ==b[j]){
			 }
			}
			 }
         System.out.println("The common numbers are " +Arrays.toString(a));
	}
	
}


	     
	     
	
	
	
	
	
	
	
	
         


		
		

	


