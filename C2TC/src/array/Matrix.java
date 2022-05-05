package array;

public class Matrix {

	public static void main(String[] args) {
		int arr[][] = {{2,7,9},{4,6,9},{7,4,8}};
		
		for(int i=0; i<3; i++) //Row
		{
			for(int j=0; j<3; j++) //Column
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}

}
