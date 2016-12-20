package fileoperationsnew;

import java.util.Scanner;

public class DivideConsole {
	public static void main (String args[]){

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers:");
		int x,y,z,w;
		x = scan.nextInt();
		y= scan.nextInt();
		z = x/y;
		w = x%y;
		System.out.println("The quotient of two numbers is  " +z);
		
		System.out.println("The remainder of two numbers is " +w);
		scan.close();
	}
}