package arrays;

import java.util.Scanner;

//Q. Take an array of names as input from the user and print them on the screen.
public class NameInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String names[] = new String[size];

		// Input
		for (int i = 0; i < size; i++) {
			names[i] = sc.next();
		}
		// Output
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name " + (i + 1) + " is " + names[i]);
		}
	}
}
