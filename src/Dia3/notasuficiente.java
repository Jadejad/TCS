package Dia3;

import java.util.Scanner;

public class notasuficiente {

	public static void main(String[] args) {
		
		System.out.println("Dame una nota");
		Scanner nota = new Scanner(System.in);
		int notain = nota.nextInt();
		if(notain >= 0 && notain < 7) {
			System.out.println("Insuficiente");
		}else if(notain >= 7 && notain < 9) {
			System.out.println("Suficiente");
		}else if (notain >=9 && notain <=10){
			System.out.println("Bien");
		}else {
			System.out.println("Nota fuera de rango");
		}
		

	}

}
