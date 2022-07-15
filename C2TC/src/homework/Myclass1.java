package homework;

public class Myclass1 {
static int a= 20;
Myclass1(){
	a++;
	
}
void m1() {
	a++;
	System.out.println(a);
}
public static void main(String[] args) {
	Myclass1 obj = new Myclass1();
	Myclass1 obj1 = new Myclass1();
	Myclass1 obj2= new Myclass1();
	obj2.m1();
}
}
