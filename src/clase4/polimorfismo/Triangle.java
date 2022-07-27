package clase4.polimorfismo;

public class Triangle implements Shape{
	
	private double side1;
	private double side2;
	private double side3;
	
	private double base;
	private double height;
	
	public Triangle(
			double side1,
			double side2,
			double side3,
			double base,
			double height
	) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.base = base;
		this.height = height;
		
	}
	
	public double perimeter() {
		return side1 + side2 + side3;
	}
	
	public double area() {
		return base * height / 2;		
	}
	
}
