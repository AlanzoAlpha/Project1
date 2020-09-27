
public class Currygoat extends Food {

	public Currygoat(String name, String rice, boolean vegetable, int price, String meat) {
		super(name, rice, vegetable, price, meat);
		this.cookVegetable = true;

		this.price = 10;
		this.rice = "rice";
		this.name = "Curry Goat";
		this.meat = "goat";

	}

	public void curryFlavour() {
		System.out.println(this.name + " is a spicy and mild dish");
	}

	@Override
	public void foodOrigin() {
		System.out.println(this.name + " is an Caribbean food");

	}
}
