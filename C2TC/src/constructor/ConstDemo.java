package constructor;

public class ConstDemo {

	int value1;
	int value2;
	ConstDemo()
	{
		value1 = 10;
		value2 = 20;
		System.out.println("Inside Constructor.");
	}
	public void display() {
		System.out.println("value1===" + value1);
		System.out.println("value2===" + value2);
	}
	public static void main(String[] args) {
		ConstDemo d1 = new ConstDemo();
		d1.display();
	}
}
