package cuadrado;

import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i = 0;
		
		for (i = 1; i <= n; i++) {
			System.out.println(i*i);
		}
	}

}
