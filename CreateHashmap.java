package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CreateHashmap {
// First we need to declare hash map
	public static void main (String [] args){
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(1, "h");
    hm.put(2, "i");
    hm.put(3, "m");
    hm.put(4, "a");
    hm.put(5, "b");
    hm.put(6, "i");
    hm.put(7, "n");
    hm.put(8, "d");
    hm.put(9, "u");
    System.out.println("Creating hasmap:");
@SuppressWarnings("rawtypes")
Set s = hm.entrySet();
@SuppressWarnings("rawtypes")
Iterator iterator = s.iterator();
while(iterator.hasNext()){
	@SuppressWarnings("rawtypes")
	Map.Entry e =( Map.Entry)iterator.next();
	System.out.println("Key is: " +e.getKey() + " :: Value is: " +e.getValue());
}

System.out.println("Search value for a key:");
String value = hm.get(5);
System.out.println("The value at key 5 is " +value);

	
	}
}