package stringEx;

public class ConcatEx {

	public static void main(String[] args) {
		
		String s1 = "java string";
		
		s1.concat("is immutable.");
		
		System.out.println(s1);

		s1= s1.concat(" is immutable so assign it explicitly.");
		
		//here we are joining the two strings by using "concat".
		
		System.out.println(s1);
	}

}
