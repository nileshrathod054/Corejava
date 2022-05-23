package constructor;

public class Student {

	int id;
	String name;
	
	Student() {
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=11;
		s1.name="Nilesh";
		System.out.println(s1.id+" "+s1.name); //printing members with a white space.
	}
}
