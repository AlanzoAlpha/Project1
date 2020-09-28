package tutorials;

public class Motorcycle extends Vehicle {

	public Motorcycle(String type, int age, int door, String colour, int wheel, int price) {

		super(type, age, door, colour, wheel, price);
		this.type = type;
		this.age = age;
		this.door = door;
		this.colour = colour;
		this.wheel = wheel;
		this.price = price;
	}

	@Override
	public void horn() {
		System.out.println("Keeeeeep");

	}
}
