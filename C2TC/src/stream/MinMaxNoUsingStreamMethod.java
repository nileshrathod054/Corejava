package stream;

import java.util.ArrayList;
import java.util.List;

public class MinMaxNoUsingStreamMethod {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(14);

		numbers.add(4);

		numbers.add(11);

		numbers.add(78);

		numbers.add(2);

		numbers.add(99);

		numbers.add(7);

		System.out.println(numbers);

		// [14,4,11,78,2,99,7]

		Integer minNum = numbers.stream().min((s1, s2) -> s1.compareTo(s2)).get();

		System.out.println("Minimum number value in list is " + minNum);

		// Minimum Number value is in list is 2.

		Integer maxNum = numbers.stream().min((s1, s2) -> s1.compareTo(s2)).get();

		System.out.println("Maximum number value in list is " + maxNum);

		// Maximum number value is list is 99.
	}

}
