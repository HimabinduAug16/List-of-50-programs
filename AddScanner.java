package fileoperationsnew;

import java.util.Scanner;

public class AddScanner {

	public static void main (String [] args){
		System.out.println("Enter two numbers:");
		Scanner scan = new Scanner (System.in);
		int a,b,c;
		a = scan.nextInt(); // inputs next integer
		b = scan.nextInt();
		c=a+b;
		System.out.println("The sum of two numbers is " +c);
		scan.close();
	}
}
