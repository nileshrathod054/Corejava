package collectionFramework;
import java.util.*;
 
public class StackEx1 {

	public static void main(String[] args) {
		
		Stack<String>stack = new Stack<String>();
		stack.push("Hi");
		stack.push("Hello");
		stack.push("Bye");
		stack.push("Good Morning");
		
		//Iterator for the stack
		Iterator<String>itr = stack.iterator();
		
		//Printing the stack 
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println();
		stack.pop();
		
		//Iterator for the stack
		itr = stack.iterator();
		
		//Printing the stack
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
}
