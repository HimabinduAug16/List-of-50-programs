package strings;


public class PalindromeOfAString {
/*. Remember a string is a palindrome if it remains unchanged when reversed
 * for example "dad" is a palindrome as reverse of "dad" is "dad" whereas "program" is not a palindrome
 */
	
	public static void main (String [] args){
		
		
		String s = "mom";
		String r = "";
		for(int i = s.length()-1; i>=0;i--){
			r+= s.charAt(i);
		}
		System.out.println(r);
		if(s.equalsIgnoreCase(r)){
			System.out.println("Entered string is palindrome.");
		}else{
			System.out.print("Entered string is not palindrome.");
		}
		
	}
}

