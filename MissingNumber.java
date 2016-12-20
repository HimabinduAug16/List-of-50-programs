package arrays;
// unsorted, sorted ,just like calculating value sorted,  more than one missing number hashset



import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;


public class MissingNumber {

	
	// to find missing number we must should first sort the order using Arrays.sort method
		/* manipulating arrays (such as sorting and searching)
		 * 
		 */

		public static void main(String[] args)
		{
	
			 Scanner scan = new Scanner (System.in);  // use scanner to read the output values 
			 
			 int [] n = {4,8,12,18,6,10};
			
			 Arrays.sort(n); // sorting as numbers are not in sequence
		     scan.close();
		HashSet<Integer> hs=new HashSet<Integer>(); // 
		int n1=0; // to which missing numbers are allocated create new array variable and adds to n1
		
		for(int i=0; i<20; i++) 
			                     // to print numbers and check the condition
		{
		if (n1<n.length && i==n[n1])  // conditional operands checks the condition
		{
		n1++;
		
	    }
		else{
		hs.add(i); // adds elements to the array list
		}
		}
		System.out.println("The missing numbers in the series is " +hs+ ".");
		}
        }
        

      

	


