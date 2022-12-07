package loops;

public class NumberOfDigits {

	public static void main(String[] args) {
		int n, c;
		n = 1234;
		c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		System.out.println("Number of Digits : " + c);
	}
}
