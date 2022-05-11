package exception;

public class FinallyDemo {

	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("Demo");
			
		} finally {
			System.out.println("procA's finally");
		}
	}
	static void procB() { //Return from within a try block.
		try {
			System.out.println("Inside procB");
			return;
			
		} finally {
			System.out.println("procB's finally");
			
		}
		
	}
	static void procC( ) { //Execute a try block normally.
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("procC's finally");
		}
		
	}
	public static void main(String[] args) {
		try {
			procA();
			
		} catch(Exception e)
		{
			System.out.println("Exception caught");
			procB();
			procC();
		}
	}
}
