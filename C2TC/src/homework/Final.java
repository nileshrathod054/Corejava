package homework;

public class Final {
	final int assign=30;
public static void main(String[] args) {
	
	final int  result=20;
	final int assign;
	Final f=new Final();
	assign=20;
	System.out.println(assign);
	System.out.println(f.assign);
	System.out.println(f.process(result));
}
int process(int a)
{
	return a+5;
}
}
