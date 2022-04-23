package inheritance;

 class One_1 {   //Multilevel Inheritance

	void disp1() {
		System.out.println("One_1");
		
	}
}

class Two_2 extends One_1 {
	
	void disp2() {
		System.out.println("Two_2");
		
		
     }

}

class Three_3 extends Two_2 {
	
	void disp3() {
		System.out.println("Three_3");
		
		
   }

}
class Four_4 extends Three_3 {
	
	void disp4() {
		System.out.println("Four_4");
		
   }
}




