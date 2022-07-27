package Dia3;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		System.out.println("Este programa puede indicarte si la fecha ingresada es correcta o no");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa un día:");
		int day=entrada.nextInt();
		System.out.println("Ingresa un mes:");
		int month=entrada.nextInt();
		System.out.println("Ingresa un año:");
		int year=entrada.nextInt();
		
		if(day > 0 && day < 31 && month > 0 && month < 13 && year >  0) {
			System.out.println("La fecha es correcta:"  + day + "-" + month + "-" + year);			
		}else {
			System.out.println("La fecha es incorrecta:" + day + "-" + month + "-" + year);
		}
	

	}

}
