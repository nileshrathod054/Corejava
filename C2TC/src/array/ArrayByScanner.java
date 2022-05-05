package array;

import java.util.Scanner;

public class ArrayByScanner {
	
		public static void main(String[] args) {
			
			int a[] = new int[3];
			int length;
			Scanner sc= new Scanner(System.in);
			length = sc.nextInt();
			System.out.println("Enter the array element");
			for(int i=0;i<length;i++) 
			{
				a[i]=sc.nextInt();
			}
				System.out.println("Array elements are");
				for(int i=0;i<length;i++) 
				{
					System.out.println(a[i]+"");
				}
			}
		}




