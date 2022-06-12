package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main1 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(5);
	
		num.add(9);
		
		num.add(8);
		
		num.add(1);
		
		num.add(2);

		Consumer<Integer> method = (n) -> {
			
			//Consumer interface is used to store the lambda expression in a variable.
			
			System.out.println(n);
		};
	
		num.forEach(method);

	}
}
