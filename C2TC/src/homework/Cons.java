package homework;

public class Cons {

	Cons() //constructor
	{
		
	int a= 10;
	int b= 20;
	int c= a+b;

	System.out.println("constructor");
	System.out.println("sum of no is "+ c);
	
	}
  
	public static void main(String[] args) {
	
	System.out.println("cons");
	
	Cons ob1= new Cons();
    
   }

}