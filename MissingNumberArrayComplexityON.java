package strings;

public class MissingNumberArrayComplexityON {
	
	public static int MissingNumber(){
		int [] a = {21,22,23,24,25,27,28,29,30};
		int i;
		int x = 0, y = 0;
		for( i = 0; i<a.length; i++)
		   {
			x = x^i;
			}
		for(i=0;i<a.length;i++)
		{
			y = y^a[i];
		}
		return x^y;
	}

	public static void main(String[] args) {
		MissingNumber();
System.out.println("The missing number is ");
	}

}
