package arrays;

import java.util.Scanner;

//Q. Take an array of numbers as an input and check if it is an array sorted in ascending order.
public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];

		// Input
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		boolean isAscending = true;

		for (int i = 0; i < numbers.length-1; i++) {// This is the condition for descending order
			if (numbers[i] > numbers[i + 1]) {
				isAscending = false;
			}
		}
		if (isAscending) {
			System.out.println("The array is sorted in ascending order.");
		} else {
			System.out.println("The array is sorted in descending order.");

		}
	}

}
