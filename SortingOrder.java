package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// one can be done by swapping numbers using temporary varaiable and other by using in built api

public class SortingOrder {

	public static void main (String [] args){
		System.out.println("Method using swapping of numbers by assigning varaible.");
		int [] xyz = {5,8,1,10,13,8};
		int w;
		int i,j;
		System.out.println("Unsorted Order");
		System.out.println(Arrays.toString(xyz));
		System.out.println("AscendingOrder");
		for(i=0; i<xyz.length;i++){
			for(j=0; j<xyz.length; j++)
			{
				if (xyz[i]>xyz[j])    // ascending order, increasing order hence greater than symbol
				{
					w = xyz[i];
					xyz[i] = xyz[j];
					xyz[j] = w;
				}
			}
		}
		for(i=0; i<xyz.length-1; i++)
		{	
		}
		System.out.println(Arrays.toString(xyz));
		System.out.println("DescendingOrder");
		for(i=0; i<xyz.length;i++){
			for(j=0; j<xyz.length; j++)
			{
				if (xyz[i]<xyz[j])  // descending order, decreasing order, hence less than symbol
				{
					w = xyz[i];
					xyz[i] = xyz[j];
					xyz[j] = w;
				}
			}
		}
		for(i=0; i<xyz.length+1; i++)
		{	
		}
		System.out.println(Arrays.toString(xyz));
		
	    System.out.println("Method using in built.");
		Integer [] abc = {5,8,1,10,13,8};
		List<Integer>List = Arrays.asList(abc);  // uses array list as function is to retrieve the data
		System.out.println("Unsorted order.");
		System.out.println(Arrays.toString(abc));
		Arrays.sort(abc);
		System.out.println("Ascending Order.");
		System.out.println(Arrays.toString(abc));
		System.out.println("Descending order.");
		for(int m=0;m<abc.length; m++){
		}
		Collections.reverse(List);
		List.toArray(abc);
		System.out.println(Arrays.toString(abc));
	
	}
}