package collections;

public class EnumProgram {
	
	// declare enum
	public enum Month {JAN, FEB, MAR}

	Month m;  // constructor
	 EnumProgram(Month m){
		 this.m = m;
	 }

	public void displayenum(){
		switch(m){
		case JAN:
			System.out.println("January");
		default:
			break;
		case FEB:
			System.out.println("Febraury");
			break;
		case MAR:
			System.out.println("March");
			break;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Enum of first three months in a year:"); 
        EnumProgram firstmonth = new EnumProgram(Month.JAN);
        firstmonth.displayenum();
        EnumProgram secondmonth = new EnumProgram(Month.FEB);
        secondmonth.displayenum();
        EnumProgram thirdmonth = new EnumProgram(Month.MAR);
        thirdmonth.displayenum();
	}
}
