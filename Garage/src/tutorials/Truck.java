package tutorials;

public class Truck extends Vehicle {

	public Truck(String type, int age, int door, String colour, int wheel, int price) {
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
		System.out.println("Booop");
	}

	public void loaded() {
		System.out.println("I am loaded be careful");
	}

}
