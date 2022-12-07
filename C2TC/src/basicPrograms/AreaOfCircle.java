package basicPrograms;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		// double rad = 10;
		final double PI = 3.14159;
		double area = PI * rad * rad;
		System.out.println("\n Area of Circle: " + area);
	}
}
