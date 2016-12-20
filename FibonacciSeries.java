package loopsconcept;

public class FibonacciSeries {
	
	
	
	/*A fibonacci series, in which each number is the sum of the two preceding in series.
	 * By definition, the first two numbers in the Fibonacci sequence are either 1 & 1 or 0 & 1 depending on choice of usage.
	   then each subsequent number is the sum of the previous two.
	 * In mathematical representation, Fn = Fn-1+Fn-2
	 * In java program we can use for loop for small numbers, arrays for big count.
	 */
	
	/*The for statement provides a compact way to iterate over a range of values. Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the for statement can be expressed as follows:

		for (initialization; termination;
		     increment) {
		    statement(s)
		}
		When using this version of the for statement, keep in mind that:

		The initialization expression initializes the loop; it's executed once, as the loop begins.
		When the termination expression evaluates to false, the loop terminates.
		The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
		*/


	  
	static int f = 20;
     static int f1 = 0;    // Initialization of variables.
 	 static int f2= 1;
 	 static int f3;      // fibonacci number output
 	
 	  
 	  
     public static void main(String[] args)
     
     {
    	 System.out.println("The Fibonacci series as follows:"); 
    	 
    	 /*   for loop is used
    	  *   set a value, define the condition for the loop to run, precede the value 
    	  */

          for(f=0;f<=20;f++)  // if f = 1, output is reached to 6765, f = 2, 4181, f=0, 10946 `
    		 
    	 {
    		 f3 = f1+f2;
    		 f1 = f2;
    		 f2 = f3;
    		        // Again go to loop if condition satisfies and continues till end of the loop.
    		
     		
    System.out.print(" " +f3);  // Given print to view out put horizantally instead of println and space in between the numbers
    		
    		
    	 }
}
      
}
