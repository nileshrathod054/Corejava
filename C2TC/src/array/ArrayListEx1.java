package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		//Create an ArrayList obj with an initial capacity of 10.
		List<String>list=new ArrayList<String>();
		
		//Call add() method to add elements at the end of the list using the reference variable list.
		System.out.println("Adding elements to end of list");

		System.out.println();
		
		list.add("A"); //Adding element at index o;
		list.add("B"); //Adding element at index o;		
		list.add("D"); //Adding element at index o;
		list.add("E"); //Adding element at index o;
		list.add("G"); //Adding element at index o;
		
		System.out.println("ArrayList insertion order:" +list);
		System.out.println();
		
		System.out.println("Adding an element at a specific index after B element.");
		list.add(2,"C");
		System.out.println();
		
		System.out.println("ArrayList insertion order after adding C:" +list);
		System.out.println();
		
		System.out.println("Adding an element at a specific index after E.");
		list.add(5,"F");
		System.out.println();
		
		System.out.println("ArrayList insertion order after adding F:" +list);
		System.out.println();
	}

}
