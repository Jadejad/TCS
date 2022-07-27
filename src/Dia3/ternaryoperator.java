package Dia3;

import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args) {
		
		String name = "Alexis";
		Scanner entrada = new Scanner(System.in);
		Boolean nameequal = false;
		System.out.println("Ingrese un nombre");
		String namein = entrada.nextLine();
		if(namein == name) {
			nameequal = true;
		}
		String resultado = nameequal ? "No eres " + name :"Correcto";
		System.out.println(resultado);
	}
}
