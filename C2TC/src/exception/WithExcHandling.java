package exception;

public class WithExcHandling {

	public static void main(String[] args) {
		
		int d=0,a;
		
		try {
			
			a=42/d;
			System.out.println("This will not be printed.");
		
		} catch(ArithmeticException ae) {
			
			System.out.println("Division by zero");
		}
		System.out.println("This will get printed.");
	}

}
