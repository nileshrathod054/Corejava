package exception;

public class WithoutExc {

	public static void main(String[] args) {
		try
		{
			int mynum[]= {10,1,2,3,4,11};
		
			System.out.println(mynum[10]);
		
		}
		
		catch(Exception e)
		
		{
			System.out.println("Element doesn't exist");
		}
          System.out.println("Hi");
	}

}
