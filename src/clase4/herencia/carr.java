package clase4.herencia;


public class carr extends vehicle{
	
	private static final int FUEL_CAPACITY = 80;
	private static final int SEATS = 5;
	
	public carr(String color) {
		super(FUEL_CAPACITY, SEATS, color);
		maxSpeed = 100;

	}
	
}


