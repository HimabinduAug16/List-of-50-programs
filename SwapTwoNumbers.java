package loopsconcept;

public class SwapTwoNumbers {
	
	//the act of swapping two variables refers to mutually exchanging the values of the variables.

	 public static void main(String args[]) {
		 
		  
	// Function using without third variable
		 int a = 2;
		 int b = 3;
		 System.out.println("Function without using third variable");
		 System.out.println("Before swapping");
		 System.out.println("a = " +a);
		 System.out.println("b = "+b);
		 System.out.println("After swapping");
		 
		  a = a+b;
		  b = a-b;   // add two numbers, total is 5 so to assign b, subtract from a(5) gives value 2 and subtract b(2) from a gives value 3
		  a = a-b;
		 
		  System.out.println("a = " +a);
		  System.out.println("b = " +b);
		  System.out.println(" ");
		  
		  // Function using third variable
		  
		  int x,y,z;
		  x = 10;
		  y = 30;
		System.out.println("Function with using third variable");
		System.out.println("Before swapping");  
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		  z = x;
		  x = y;
		  y = z;
		  System.out.println("After swapping"); 
		  System.out.println("x = "+x);
		  System.out.println("y = "+y);
		  
		 	 }
	 }



