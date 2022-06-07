package generics;

import java.util.ArrayList;

public class GenericsEx {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");

		// list.add(123); compile time error

		for (String str : list) {

			// No type casting needed. ClasscastException never occurs.

			System.out.println(str);

		}
	}
}