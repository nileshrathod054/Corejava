package homework;

public class Myclass4 {
private static int x=10;
static {
	x++;
}
static {
	++x;
}
{
	x--;
}
public static void main(String[] args) {
	Myclass4 obj = new Myclass4();
	Myclass4 obj2 = new Myclass4();
	Myclass4 obj3= new Myclass4();
	System.out.println(x);
	
}
}
