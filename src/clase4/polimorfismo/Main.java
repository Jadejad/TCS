package clase4.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[] {	
			new Triangle (10,10,10,10,10);
			new Square (10);
		};
		
		for(Shape shape : shapes) {
			System.out.println("Perimeter: " + shape.perimeter());
			System.out.println("Area: " + shape.area());
			System.out.println("-----------");
		}
	}

}
