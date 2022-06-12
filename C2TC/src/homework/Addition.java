package homework;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number1, number2, sum;

		System.out.println("Enter the first number");
		number1 = sc.nextInt();

		System.out.println("Enter the second number");
		number2 = sc.nextInt();

		sum = number1 + number2;

		System.out.println("Sum=" + sum);
	}
}
