package arrays;

import java.util.Scanner;
//Taking an array as an input and printing its elements.
public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();

		}
		// Print the numbers in array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
