package weekendAssessment;

public class SwitchCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "te";
		
		switch(name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		
		case "editor":
		    System.out.println("Vishnu and Krishna");
			break;
	
		default:
			System.out.println("Invalid Entry");
			break;
		}
	}

}
