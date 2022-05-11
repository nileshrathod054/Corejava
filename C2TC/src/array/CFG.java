package array;

public class CFG {
	
		 public static void main(String[] args) {
		
			 //declares an Array of Integers.
			 Student1[] arr;
			 
			 //allocating memory for 5 objects of type Student.
			 arr= new Student1[5];
			 
			 //initialize the first elements of the array.
			 arr[0] = new Student1(1,"Nilesh");
			 
			 //initialize the second elements of the array.
			 arr[1] = new Student1(2,"Suraj");
			 
			 //So on...
			 arr[2] = new Student1(3,"Ashwin");
			 arr[3] = new Student1(4,"Santosh");
			 arr[4] = new Student1(5,"Shridhar");
			 
			 //accessing the elements of the specified array.
			 
			 for(int i = 0; i<arr.length; i++)
				 System.out.println("Element at" +i +" : " + arr[i].roll_no +" " + arr[i].name);
		}
	
}
	 
	 
	 
	 

