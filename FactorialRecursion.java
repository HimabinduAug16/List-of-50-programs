package loopsconcept;

public class FactorialRecursion {

	/*The factorial of a number be found using recursion also. The base case can be taken as the factorial of the number 0 or 1, both of which are 1. The factorial of some number n is that number multiplied by the factorial of (n-1). Mathematically, 

	factorial ( 0 ) = 1
	factorial ( n ) = n * factorial ( n - 1 )
	function factorial is:
    input: integer n such that n >= 0
    output: [n × (n-1) × (n-2) × … × 1]

     1. if n is 0, return 1
     2. otherwise, return [ n × factorial(n-1) ]

end factorial

Computing the recurrence relation for n = 4:
b4           = 4 * b3
             = 4 * (3 * b2)
             = 4 * (3 * (2 * b1))
             = 4 * (3 * (2 * (1 * b0)))
             = 4 * (3 * (2 * (1 * 1)))
             = 4 * (3 * (2 * 1))
             = 4 * (3 * 2)
             = 4 * 6
             = 24
	
	
*/
	
	public static void main(String args[]){
		
		int n = 13;                                                   
		int n1 = factorial(n); 
		System.out.println("Finding the factorial using resursion.");
		System.out.println("The factorial of " + n + " is " + n1);
	}
	static int factorial (int n) {
		if (n==0){
			return 1;
		}else{
		
		return n*factorial(n-1);
		}
		}

	}
	


	
	
		
	
