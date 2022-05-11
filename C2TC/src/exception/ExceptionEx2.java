package exception;

public class ExceptionEx2 {

	public static void main(String[] args)
	    {
		try 
	
		{
			//Creating an object of Arithmetic Exception
			
			ArithmeticException ae = new ArithmeticException();
			
			//Manually throwing Arithmetic Exception.
			
			throw ae;
			
		}
 
		catch(ArithmeticException e)
	
		{
	
	System.out.println("Rethrowing the caught exception below");
	
	//Rethrowing Arithmetic Exception.
	
	throw e;
		}
	}

}
