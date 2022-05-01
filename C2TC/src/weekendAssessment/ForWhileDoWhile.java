package weekendAssessment;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop
		int j = 0;
		for(int i=1; i<10 || j<10; i++, j++)
		{
			j++;
			System.out.println("i="+i+ "and j="+j);
		}
		
		//while loop
		int i=1,j1=1;
		do {
			i++;
			j1++;
			System.out.println("i="+i+ "and j1="+j1);
		}
		while(i<10 || j1<10);
		}
	}



