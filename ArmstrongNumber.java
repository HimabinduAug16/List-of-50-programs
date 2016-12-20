package loopsconcept;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String args[]) {

	/*An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
	  For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
	 */
	
 
    
    
     
     Scanner scan = new Scanner (System.in);  // use scanner to read the output values 
     System.out.println("Check whether the number is armstrong or not.");  // display of what to perform
	 System.out.println(" Enter the number.");
	 int number = Integer.parseInt(scan.nextLine());  //used to get the primitive data type of a certain String  leaves behind a new line character
	 int n = number;
	 scan.close();
     
     
		/* 153 = 1*1*1+5*5*5+3*3*3
		 *     =  1+125+27
		 * 
		 * First checks with first number to get the last digit of the number do modulus
		 * 153%10= 3;
		 * 15%10= 5;
		 * 1%10= 1;
		 * 
		 * then cube of each digit
		 * 1^3, 5^3, 3^3
		 * 
		 * then add all the digits
		 * you will get 153
		 * 
		 */
        
     int m;
     int s=0;
		while(number > 0)
		{
			m = number%10;   // finds the last digit of number
		    s = s+(m*m*m); // cubes and adds to sum
			n = number/10;    // truncated by 10
			
		}
			if(s!=number){
				System.out.println(n + " is armstrong");
			}else{
				System.out.println(n +" is not armstrong");
			}
		
	
			
		
	}
	
	
}
