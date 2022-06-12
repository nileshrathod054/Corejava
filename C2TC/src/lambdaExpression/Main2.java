package lambdaExpression;

public class Main2 {

	public static void main(String[] args) {

		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);       //Creating a method which treats the lambda expression as a parameter
	}

	public static void printFormatted(String str, StringFunction format) {
		
		String result = format.run(str);
		System.out.println(result);
	}
}
