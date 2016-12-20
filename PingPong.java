package loopsconcept;

public class PingPong {

	


 /* Divisibility check my mod operator, where remainder is zero
  * The if-then statement is the most basic of all the control flow statements.
  *  It tells your program to execute a certain section of code only if a particular test evaluates to true.
  */
	
    public static void main(String args[]) 

    {
    int p=45;
    if(p % 3 == 0)
    {
    	System.out.println("Ping");
    	
    }
    
    if(p%3 == 0 && p%5 ==0){
    
     System.out.println("PingPong");	
     
    }if(p%5 == 0){
 		System.out.println("Pong");
 	
 }
    else{
    	System.out.println(""+p);
    }
    
   
    
    
    }
    
}
