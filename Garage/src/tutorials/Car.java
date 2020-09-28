package tutorials;

public class Car extends Vehicle {

	// public Car() {super();}

	public Car(String type, int age, int door, String colour, int wheel, int price) {
		super(type, age, door, colour, wheel, price);
		this.type = type;
		this.age = age;
		this.door = door;
		this.colour = colour;
		this.wheel = wheel;
		this.price = price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price + wheel;
	}

}
