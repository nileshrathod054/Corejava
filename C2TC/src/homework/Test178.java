package homework;

public class Test178 {
public static void main(String[] args) {
	String s="foo";
	Object o=(Object)s;
	if(s.equals(0))
	{
		System.out.println("AAA");
	}
	else
	{
		System.out.println("BBB");

}
	if(o.equals(s))
	{
	System.out.println("CCC");
}
else
{
	System.out.println("DDD");
}
}
}
