package arrays;

public class MinimumNumber {
	  
		public static void main(String args[]){  
		  
		int a[]={23,34,89,12,4, 77, 46,55};
	    System.out.print("The minimum number is ");
		int min = a[0];  // specify the index
	     for(int i=0; i<a.length;i++){
			if(min>a[i]){
				min = a[i];	
			}
			}
	     System.out.println(min);
	   System.out.print("The maximum number is ");
			int max = a[0];  // specify the index
		     for(int i=0; i<a.length;i++){
				if(max<a[i]){
					max = a[i];
					}
				    }
	System.out.print(max);	
     }
     }


