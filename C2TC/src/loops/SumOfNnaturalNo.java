package loops;

import java.util.Scanner;

/*Print the sum of N Natural numbers*/
public class SumOfNnaturalNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}
}
