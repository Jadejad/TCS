package P2;

import java.util.Scanner;

public class ajedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe la medida del tablero");
		int n = scan.nextInt();
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++ ) {
			if (i % 2 == 0) {
				for (j = 0; j < n; j++) {
					if (j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("#");
					}
				}
			} else {
				for (j = 0; j < n; j++) {
					if (j % 2 == 0) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			
		}
	}

}
