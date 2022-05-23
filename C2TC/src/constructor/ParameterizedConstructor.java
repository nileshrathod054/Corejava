package constructor;

public class ParameterizedConstructor {

	ParameterizedConstructor()
	{
		System.out.println("Default constructor");
	}
	ParameterizedConstructor(int i, int j)
	{
		System.out.println("Constructor with two parameters.");
	}
	ParameterizedConstructor(int i, int j, int k)
	{
		System.out.println("Constructor with three parameters.");
	}
	ParameterizedConstructor(int i, String name)
	{
		System.out.println("Constructor with int and String parameters");
	}
		public static void main(String []args) {
			ParameterizedConstructor obj1= new ParameterizedConstructor();
			ParameterizedConstructor obj2= new ParameterizedConstructor(12,12);
			ParameterizedConstructor obj3= new ParameterizedConstructor(1,2,13);
			ParameterizedConstructor obj4= new ParameterizedConstructor(1,"BeginnersBook");
		}
	}

