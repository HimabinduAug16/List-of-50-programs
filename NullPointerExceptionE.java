package exceptionhandling;

public class NullPointerExceptionE {

	public static void main (String [] args) {
		String s = "Himabindu";
		String n = null;
		System.out.print("Reverse String s:"); 
		for(int i = s.length()-1; i >= 0;  i--){
			System.out.print(" " +s.charAt(i));
		}
		System.out.println(" ");
		System.out.print("Reverse String n:"); 
		try
		{
			    for(@SuppressWarnings("null")
				int j = n.length()-1; j>=0;j--){
				System.out.print(" " +n.charAt(j));
		}
		}
		catch (Exception ae){
			System.out.print(" "+ae.getMessage());
		}
		
		
		
		}
	

}
