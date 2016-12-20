package strings;

import java.util.Scanner;

public class ReverseWordsInSentence {

public static void main (String [] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the sentence: ");
	String s;
    s = scan.nextLine();
    System.out.println("Before reverse: " +s);  //inbuilt method to fine reverse of string
    StringBuffer sb = new StringBuffer (s);
	s= sb.reverse().toString();
	scan.close();
	System.out.print("After reverse: " +s);
}
}

