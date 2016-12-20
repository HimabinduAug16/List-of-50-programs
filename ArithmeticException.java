package exceptionhandling;

public class ArithmeticException {


public static void main (String [] args) {
	
int a, b, x, y, z;
a = 10;
b = 0;
x=12;
y=x*2;
z=a+x;

try{
	int c;
	c = a/b;
	System.out.println("This line is not excecuted." +c); // not executed
}catch (Exception ae){
	
	System.out.println("The value of c cannot be found as number divided by zero not accepted.");
}
System.out.println("The value of c is not defined." );
System.out.println("The value of y is " +y);
System.out.println("The value of z is " +z);
}

}



