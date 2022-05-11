package exception;

public class ExceptionEx3 {

	public static void main(String[] args)
	{
	try {
		int a = 2;
		int b = 10/a;
		System.out.println("a=" +a);
		try {
			if(a==1)
				a= a/(a-a);
			if(a==2) {
				int c[] = {1};
				c[42] = 99;
				
			}
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds: "+e);
		} 
		catch(ArithmeticException e) 
		{
			System.out.println("Divide by zero:" +e);
		}
	

	} finally 
	{
     System.out.println("exc");
	}
}
}
