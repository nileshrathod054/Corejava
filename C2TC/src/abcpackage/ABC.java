package abcpackage;

 class ABC {

	private double num = 100;

	private int square(int a) {
		
		return a*a;
	}

}                                                //we can not access the private access modifier into another class.
                                                 //The private access modifier is limited to the current class methods and data members only.
  class Example {
	
	  public static void main(String[] args) {
		
		  ABC obj = new ABC();
		
		  System.out.println(obj.num);            //Thats why we are getting an error here.
		
		  System.out.println(obj.square(10));
	}
 }