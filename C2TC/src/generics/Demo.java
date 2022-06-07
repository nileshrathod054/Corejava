package generics;

public class Demo {

	public static void main(String[] args) {

		Gen<Integer> iob = new Gen<>(100); // Instance of Integer type Gen Class.

		int x = iob.getOb();
	
		System.out.println(x);
		
		Gen<String> sob = new Gen<>("Hello"); // Instance of String type Gen class.

		String str = sob.getOb();
		
		System.out.println(str);
	}
}
