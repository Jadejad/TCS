package clase4.polimorfismo;

public class Square {
	private double side1;
	
	public Square(
			double side1
	) {
		this.side1 = side1;
		
	}
	
	public double perimeter() {
		return side1*4;
	}
	
	public double area() {
		return side1 * side1;		
	}
}
