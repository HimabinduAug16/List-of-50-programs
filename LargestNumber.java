package arrays;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String args[]){ 
		
		
		int[] a = {10, 987, 30, 236,50, 60, 587, 234};
		Arrays.sort(a);
		int max = 0;
		for(int i = 1; i<a.length; i++){
			
			if(max>a[i]){
				max = a[i];
							
		
		}
							
}
		System.out.println("The largest number is " +max);			
		
}
	}