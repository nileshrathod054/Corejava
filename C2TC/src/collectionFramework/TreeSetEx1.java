package collectionFramework;
import java.util.*;
public class TreeSetEx1 {

	public static void main(String[] args) {
		//Creating Treeset and adding elements.
		
		TreeSet<String>ts = new TreeSet<String>();
		ts.add("This");
		ts.add("Book");
		ts.add("is");
		ts.add("very helpful");
		ts.add("for");               //TreeSet doesn't maintain the insertion order.
		ts.add("me");
		
		//Traversing elements 
		Iterator<String>itr = ts.iterator();
		while(itr.hasNext()) {		
			System.out.println(itr.next());
	   }
 	
    }

}