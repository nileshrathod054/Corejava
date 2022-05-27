package stringEx;

public class EqualsEx {

	public static void main(String[] args) {
		
		String s1 ="nilesh rathod";
		String s2 ="nilesh rathod";
		String s3 ="NILESH RATHOD";
		String s4 ="corejava";
		
		System.out.println(s1.equals(s2));
		//true because content and case are same.
		
		System.out.println(s1.equals(s3));
		//false because case is not same.
		
		System.out.println(s1.equals(s4));
		//false because content is different.
		
	}

}
