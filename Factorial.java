package loopsconcept;

public class Factorial {
	
	
	
/* Factorial is the product of an integer and all the integers below it
 * We will get factorial by multiplying series of descending numbers.
 *            4! = 4*3*2*1 = 24
 *            4! = 4*3!
 *            so the rule is 
 *            n! = n*(n-1)!

 */
	

	
	/*The idea of calling one function from another immediately suggests the possibility of a function calling itself. 
	 * The function-call mechanism in Java supports this possibility, which is known as recursion
	 */
	public static void main(String args[]){
		
    // Finding factorial using recursion
		
		
		/*Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve some problem.
		 *  A method that uses this technique is recursive. 
		 *  Many programming problems can be solved only by recursion, and some problems that can be solved by other techniques are better solved by recursion.
		 * One of the classic problems for introducing recursion is calculating the factorial of an integer.

          */
		// Finding factorial using loop
	int n=12;  // Number to which factorial has to be determined
	int n1 = 1; // assigning variable to perform factorial function
    int i;     // loop condition variable
	System.out.println("Finding factorial using for loop.");
	
	for(i=1;i<=15;i++) 
		{
		
		n1 = n1*i;
		
		}
		
		
		System.out.println("The factorial of " +n +  " is " +n1);
		
		
		
	}
	
	
	
	
}





