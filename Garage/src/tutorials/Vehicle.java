package tutorials;

public class Vehicle {
	protected String type;
	protected int age;
	protected int door;
	protected String colour;
	protected int wheel;
	protected int price;

	public Vehicle() {
		super();
	}

	public Vehicle(String type, int age, int door, String colour, int wheel, int price) {
		super();
		this.type = type;
		this.age = age;
		this.door = door;
		this.colour = colour;
		this.wheel = wheel;
		this.price = price;

	}

	// Methods

	public void horn() {
		System.out.println("Beeeeeep");

	}

	public int parkingCost() {
		return price;

	}

	// Getter method

	public String getType() {
		return type;

	}

	public int getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public int getAge() {
		return age;
	}

	// Set methods
	public void setType(String type) {
		this.type = type;
	}

	public void setCollour(String colour) {
		this.colour = colour;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
