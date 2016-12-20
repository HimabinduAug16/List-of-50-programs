package strings;



public class SubstrinInAGivenStringAndReplaceiT {

	
	public static void main (String [] args){
		
		System.out.println("My name is Hima.");
		String s= "My name is Hima.";
		String s1 = "Hima";
		String s2 = "Bindu";
		
	    int i = s.indexOf(s1);
	     if(i != -1){
		System.out.println("The string contains substring " +s1+ ".");
		System.out.println("Replace " +s1+ " with " +s2+ ".");
		}
	String replace = s.replace("Hima", "Bindu");
	System.out.println(replace);
	}

}
