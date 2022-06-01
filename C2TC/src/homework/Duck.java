package homework;

public class Duck {
	private String name;

	Duck(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(new Duck("Moby"));
	}

}
