package loopsconcept;

public class StarPyramid {

	public static void main(String[] args) {
	// Nested for loop	
		// Variable initialization
		
		
	/*   * * * * * * 
		 * * * * * *
		 * * * * * *
		 * * * * * *
		 * * * * * *
		 * * * * * * 
	*/
		
		
		// rows and columns
		for(int i = 0; i<5; i++ ){    
			for(int j =0; j>5-i; j++){  // 
			
				System.out.print(" "); // prints pattern in 6 rows
			}
			
			for(int k = 0; k<=i; k++){
			System.out.print(" * ");  // prints pattern in 6 columns
			}
			System.out.println(" ");
			
	         
			
			
		
		}
		
		}

}




