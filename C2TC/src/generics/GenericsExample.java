package generics;

public class GenericsExample {
	public static void main(String[] args) {

		GenericClass<Integer> test = new GenericClass<>();

		Integer a = 5;

		test.methodgeneric(a);

		// Now we use the same class but with a different datatype.

		GenericClass<String> teststring = new GenericClass<>();

		String s = "Hello";

		teststring.methodgeneric(s);
	}
}
