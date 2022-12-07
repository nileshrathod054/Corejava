package basicPrograms;

import java.util.Scanner;

public class SimpleConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		//double n = 56.50;
		int a = (int) n;
		double p = (n - a) * 100;

		System.out.println("Rs. : " + a);
		System.out.println("Paise : " + (int) p);
	}
}
