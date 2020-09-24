package tutorials;


public class Truck extends Vehicle{
	
	

	public Truck (String type, int age, int door, String colour, int wheel, int price) 
	{super(type, age, door, colour, wheel, price);
	
	this.type = type;
	this.age = age;
	this.door = door;
	this.colour = colour;
	this.wheel = 0;
	this.price = 0;
	


		}
	
	@Override 
	public void horn() {
		System.out.println("Booop");}
	
	public void loaded() {System.out.println("I am loaded be careful");}
	
	@Override
	public int parkingCost() {
		return age *price;
	}
	


}
