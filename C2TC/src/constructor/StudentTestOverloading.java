package constructor;

public class StudentTestOverloading {
	public static void main(String[] args) {
		//This object creation would call the default constructor.
		
		StudentData obj1 = new StudentData();
		System.out.println("Student name is : "+obj1.setStuName());
		System.out.println("Student Age is : "+obj1.getStuAge());
		System.out.println("Student ID is : "+obj1.getStuID());
		System.out.println("*********************************");
		/*
		 * This object creation would call the parameterized constructor.
		 * StudentData(int, String, int)
		 */
	
		StudentData obj2 = new StudentData(11,"Nilesh",25);
		System.out.println("Student name is : "+obj2.setStuName());
		System.out.println("Student Age is : "+obj2.getStuAge());
		System.out.println("Student ID is : "+obj2.getStuID());
	}
}
