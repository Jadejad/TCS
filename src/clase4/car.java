package clase4;

public class car {

	private String color;
	private String modelo;
	private String matricula;
	
	private int speed;
	
	
	public car(String modelo, String matricula) {//constructor con color por default
		this("gris",modelo,matricula);
	}
	
	public car(String color, String modelo, String matricula) { //Constructor completo
		this.color = color;
		this.modelo = modelo;
		this.matricula = matricula;
		this.speed = 0;
		
	}
	
	public void accelerate() {
		speed = speed + 10;
		System.out.println(modelo + " accelerating at " + this.speed + "Km/H");
	}
	
	public void accelerate(int speed) {
		this.speed = this.speed + speed;
		System.out.println(modelo + " accelerating at " + this.speed + "Km/H");
	}
	public static void main(String[] args) {
		car honda = new car("rojo","honda civic","123abc");
		honda.accelerate();
		honda.accelerate();
		honda.accelerate();
		honda.accelerate(2);

	}

}
