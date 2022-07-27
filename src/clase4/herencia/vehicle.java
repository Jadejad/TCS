package clase4.herencia;

public class vehicle {

	private int fuelcapacity;
	private int seats;
	private String color;
	
	private int speed;
	protected int maxSpeed;
	
	public vehicle( int fuelcapacity, int seats, String color) {
		this.fuelcapacity = fuelcapacity;
		this.seats = seats;
		this.color = color;
		this.speed = 0;
	}
	
	
	public void accelerate() {
		speed += 10;
		if (speed >= maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("Speed: " + speed);
	}
	public void brake () {
		speed -= 10;
		if (speed <= 0) {
			speed = 0;
		}
		System.out.println("Speed: " + speed);
	}
	
}
