package fileoperationsnew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAndInputStream {
	
public static void main(String args[]) throws Exception, IOException{
//	buffers the information each time a native I/O is called	
	int a,b,c;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two munbers.");
	a = Integer.parseInt(br.readLine());
	b = Integer.parseInt(br.readLine()); //his method is used to get the primitive data type of a certain String. 
	c=a-b;
	System.out.println("The difference of two numbers is " +c);
	
		
		
		
		
		
}
}
