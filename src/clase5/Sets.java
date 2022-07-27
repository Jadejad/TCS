package clase5;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("pedro");
		set1.add("Juan");
		set1.add("Alexis");
		
		boolean belongs = set1.contains("pedro");
		
		System.out.println(belongs);
		
		

	}

}
