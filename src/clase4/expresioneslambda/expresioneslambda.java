package clase4.expresioneslambda;

import java.util.Arrays;

public class expresioneslambda {

	public static void main(String[] args) {
		
		Arrays.asList(10,10,9,8,7,9,10)
			.stream()
			.filter((n) -> n >= 9)
			.forEach((n) -> System.out.println(n));
		
		boolean output = Arrays.asList(10,10,9,8,7,9,10, 11)
			.stream()
			.anyMatch((n) -> n > 10);
		System.out.println("output: " + output);
		
		boolean output2 = Arrays.asList(10,10,9,8,7,9,10, 11)
			.stream()
			.allMatch((n) -> n > 10);
		System.out.println("output: " + output2);
	
		Arrays.asList(1,2,3,4,5)
			.stream()
			.map((num) -> num * num)
			.forEach((num) -> System.out.println(num));
			
		Arrays.asList(1,2,3,4,5)
			.stream()
			.map((num) -> num + "^2" + " = " +num * num)
			.forEach((num) -> System.out.println(num));	
		/*	
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = numbers
			.stream()
			.reduce(0,(accumulated, item) -> accumulated + item);
		System.out.println(sum);
		*/
	}

}
