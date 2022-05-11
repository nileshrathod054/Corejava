package exception;

public class JavaHungry {
public static void main(String[] args) {
	try {
		System.out.println("Inside try block"); //output inside try block
		//After executing below line the JVM will terminate the program.
		System.exit(0);
		
	} catch(Exception e)
	{
		System.out.println("Inside catch block");
	}
	finally
	{
		System.out.println("Inside finally block");
	}
}
}
