package general;

public class NoLoopPrintNumbers {
	
		
	
		public static void r(int n) {
		    if(n <= 10) {// 10 is the max limit
		        System.out.println(n);//print n
		        r(n+1);//call recursionj with n=n+1
		    }
		}
		
		public static void main(String [] args){
		r(1); // call the function with 1.
}
}
