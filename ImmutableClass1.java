package general;

public final class ImmutableClass1 {
	
	    final public String name;
	    final private int age;
	    public ImmutableClass1(final int age, final String name) {
	        this.age = age;
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getName() {
	        return name;
	    }
	

public static void main(String [ ] args){
	ImmutableClass1 obj = new ImmutableClass1(20, "Bindu");
	
System.out.println("Immutable class is created");
System.out.println(obj.name);
}
}