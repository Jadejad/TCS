package clase5;

import java.util.HashMap;
import java.util.Map;



public class Maps {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		map.put("2",2);
		
		
		Integer value = map.getOrDefault("3", 0);
		System.out.println(value);
		
		Integer value1 = map.get("1");
		System.out.println(value1);
		
		/*
		int result = fib(8);
		System.out.println("Result: "+ result);
		*/
		int result = fibmap(8);
		System.out.println("Result: "+ result);
		
	}
	
	public static int fib(int n) {
		//0,1,1,2,3,5,8,13, fib(b = fib(n-1) + fib(n-2))
		System.out.println("fib("+ n +")");
		if ( n == 1) return 0;
		if (n == 2 ) return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	
	public static int fibmap(int n) {
		//0,1,1,2,3,5,8,13, fib(b = fib(n-1) + fib(n-2))
		System.out.println("fib("+ n +")");
		Map<Integer, Integer> serie = new HashMap<>();
		serie.put(1,0);
		serie.put(2, 1);
		
		for (int i = 3; i <= n; i++) {
			serie.put(i,  serie.get(i-1) + serie.get(i-2));
			
		}
		return serie.get(n);
		
	}

}
