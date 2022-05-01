package xyzpackage;

import abcpackage.*;         // We are testing the protected access modifiers in this class.

 class Test1 extends Addition1 {

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		
		System.out.println(obj.addTwoNumbers(11,22));
	}
}
