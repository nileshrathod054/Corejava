package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapByUsingStreamMethod {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		l1.add(0);

		l1.add(15);

		l1.add(10);

		l1.add(5);

		l1.add(30);

		l1.add(25);

		l1.add(20);

		System.out.println(l1);

        //[0,15,10,5,30,25,20]

		List<Integer> l2 = l1.stream().map(i -> i + 10).collect(Collectors.toList());

		l2.stream().forEach(i -> System.out.print(i + " "));

        //10 25 20 15 40 35 30

		System.out.println(" ");

		l2.stream().forEach(System.out::println);
	}

}
