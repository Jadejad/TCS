package clase5;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;



public class Lists {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		
		Integer secondElement = numbers.get(1);
		int size = numbers.size();
		
		System.out.println(numbers);
		System.out.println(secondElement);
		System.out.println(size);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		Stack<Integer> nums = new Stack<>();
		
		nums.push(1);
		nums.push(2);
		nums.push(3);
		
		System.out.println(nums);
		
		Integer peek = nums.peek();
		System.out.println(peek);
		
		while (!nums.isEmpty()) {
			Integer item = nums.pop();
			System.out.println(item);
		}

	}

}
