package abstraction;

abstract class Abst {

	abstract void draw();
	void hai()
	{
			
	}
}

public class  Shape extends Abst {
	
	void draw() {
		
		System.out.println("Draw");
		
		
	}
	public static void main(String[] args) {
		Shape obj= new Shape();
		obj.draw();
	}
}
