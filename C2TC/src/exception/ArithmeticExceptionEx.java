package exception;

public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		
		int d=0,a;
		try 
		{
			a=55/d; //Exception will be raised here.
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero");
		}
        
		System.out.println("Will not print");
	}

}
