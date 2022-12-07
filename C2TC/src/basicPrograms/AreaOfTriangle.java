package basicPrograms;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		double area, a, b, c, s;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

//		a = 3;
//		b = 4;
//		c = 5;

		s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of Triangle is = " + area);
	}
}
