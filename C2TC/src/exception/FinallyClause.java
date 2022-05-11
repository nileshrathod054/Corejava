package exception;

public class FinallyClause {

	public  void divide(int x, int y) {
		
		int ans;
		try {
			ans=x/y;
		}
		catch(Exception e) {
			ans=0;
		}
		
			finally {
				return;
				
		}
	}
}
