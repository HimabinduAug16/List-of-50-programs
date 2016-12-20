package strings;

import java.util.Scanner;

public class ReverseStringInBuiltFunction {
public static void main (String [] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String s;
    s = scan.nextLine();
    System.out.println("Before reverse: " +s);
	StringBuffer sb = new StringBuffer (s);
	s= sb.reverse().toString();
	scan.close();
	System.out.print("After reverse: " +s);
}
}
