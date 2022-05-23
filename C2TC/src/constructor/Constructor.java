package constructor;

public class Constructor {

	public Constructor() //Default Constructor.
	{
		System.out.println("Constructor running");
	}
	public Constructor(int a) //Parameterized Constructor.
	{
		System.out.println("Constructor running : "+a);
	}
	public static void main(String[] args) {
		Constructor cd = new Constructor();
		//Parameterized Constructor calling.
		Constructor cd1 = new Constructor(5);
	}
}
