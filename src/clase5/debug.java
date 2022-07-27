package clase5;

import java.util.Scanner;

public class debug {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 boolean success = false;
		 while(!success) {
			 System.out.println("Introduce las calificaciones, separadas por coma: ");
			 String input = scanner.next();
			 String[] numbers = input.split(",");
			 double[] grades = new double[numbers.length];
			 for (int i = 0; i < numbers.length; i++) {
				 grades[i] = Double.parseDouble(numbers[i]);
			 }
			 
			 try {
				 double average = average(grades);
				 System.out.println("Resultado: " + average);
			 }catch (IllegalArgumentException ex) {
				 System.out.println(ex.getMessage());
			 }
		
		 }
		/*double[] grades = new double[] 	{
				
		};
		try {
			double average = average(grades);
			System.out.println(average);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} */
	}
	public static double average(double[] grades) {
		
		if (grades.length == 0) {
			throw new IllegalArgumentException("no hay calificaciones");
		}
		
		double sum =0;
		for (double grade : grades) {
			sum = sum + grade;
		}
		
		double average = sum / grades.length;
		return average;
	}

}
