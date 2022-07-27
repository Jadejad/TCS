package clase4.herencia;

public class main {

	public static void main(String[] args) {
		vehicle[] vehicles = new vehicle[] {
				new carr("verde"),
				new motorcycle("rojo")
		};
		for (vehicle vehicle : vehicles) {
			vehicle.accelerate();
			vehicle.accelerate();
			vehicle.brake();
			System.out.println("------------");
		}
	}

}
