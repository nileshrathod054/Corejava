package inheritance;

 class One {  //Single Inheritance.
  
	 void disp1( )
	 {
		 System.out.println("One");
	 }
}

 class Two extends One
 {
	 void disp2()
	 {
		 System.out.println("Two");
		 System.out.println("");
	 }
	 
 }
 
 class Three extends One  //Used for Hierarchical Inheritance.
 {
	 void disp3()
	 {
		 System.out.println("Three");
		 System.out.println("");
	 }
	                                   
 }
 class Four extends One
 {
	 void disp4()
	 {
		 System.out.println("Four");
		 System.out.println("");
	 }
	 
 }
 
 
 