package tutorials;

public class Vehicle {
	protected String type;
	protected int age;
	protected int door;
	protected String colour;
	protected int wheel;
	protected int price;
	
	
	public Vehicle (String type, int age, int door, String colour, int wheel, int price) {
		this.type = type;
		this.age = age;
		this.door = door;
		this.colour = colour;
		this.wheel = 0;
		this.price = 0;
		
	}
		// Getter method
	    public String getName() {
	        return type;

	}
	 // Getter method
	    public int getPrice() {
	        return price;
	    }
}
