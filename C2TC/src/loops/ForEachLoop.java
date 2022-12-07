package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int x : ar) {
			System.out.print(x + " ");
			x = x * 10; // No effect on nums
		}
		System.out.println();
		for (int x : ar)

			System.out.print(x + " ");
	}
}
