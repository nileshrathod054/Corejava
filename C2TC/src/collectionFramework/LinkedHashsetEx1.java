package collectionFramework;
import java.util.*;
public class LinkedHashsetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating LinkedHashset and adding elements.
		LinkedHashSet<String>lhs = new LinkedHashSet<String>();
		
		lhs.add("This");
		lhs.add("Book");
		lhs.add("is");
		lhs.add("very helpful");
		lhs.add("for");
		lhs.add("me");
		
		//Traversing elements 
		Iterator<String>itr = lhs.iterator();
		while(itr.hasNext()) {		
			System.out.println(itr.next());
		}
	}

}
