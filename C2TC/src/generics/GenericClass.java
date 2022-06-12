package generics;

import java.io.*;
import java.util.*;

public class GenericClass<T> {

	// This is a generic class definition. The type is T as mentioned.

	GenericClass() {
		System.out.println("The generic class is declared now. You can use it well.");
	}

	
	public GenericClass(String string) {
		
	}


	public void methodgeneric(T obj) {
		System.out.println("The type of the object that this class now contains is " + obj.getClass().getSimpleName());
	}
}
