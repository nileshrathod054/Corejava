package exception;

public class ExceptionEx {
	public static void main(String[] args) {
		try 
		{
			int a=0;
			System.out.println("a="+a);
			int b=45/a;
		/*	int c[2] = [1];
			c[45]=99;
			*/
		}catch(ArithmeticExceptionEx e)
		{
			System.out.println("Divided by 0" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Divided by 0" +e);
		}
		catch(Exception e)
		{
			System.out.println("Exception+e"+e);
		}
		System.out.println("Exc");
	}

}
