package constructor;

public class StudentData {

	private int stuID;
	private String stuName;
	private int stuAge;
	
	StudentData() {
		//Default Constructor.
		stuID=100;
		stuName="Nilesh Rathod";
		stuAge=25;
	}
	StudentData(int num1, String str, int num2) {
		//Parameterized Constructor
		stuID = num1;
		stuName = str;
		stuAge = num2;
	}
	//Getter and setter methods.
	public int getStuID() {
		return stuID;
	}
	public String setStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName=stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge=getStuAge();
	}
}
