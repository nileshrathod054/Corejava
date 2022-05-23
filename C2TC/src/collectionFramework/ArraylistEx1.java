package collectionFramework;

import java.util.*;
public class ArraylistEx1 {

	public static void main(String[] args) {
	
		ArrayList<String>list = new ArrayList<String>();
		
		//Creating ArrayList
		list.add("Akshay");
		list.add("Nilesh");      //Adding objects in Arraylist
		list.add("Shridhar");
		list.add("Suraj");
	    list.add("Nilesh");       //Arraylist allows the duplicate elements.
		//Travelling list through iterator.
		list.remove(1);
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
