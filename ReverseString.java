package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.print("Enter the string : ");
		s= scan.nextLine();
		System.out.print("Reverse of string: ");
		for(int i = s.length()-1; i>= 0; i--){
			System.out.print(s.charAt(i));	
			// walmart = lawmtra
			}
		
		scan.close();
	
	}
}
