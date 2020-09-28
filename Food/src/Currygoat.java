
public class Currygoat extends Food {

	public Currygoat(String name, String rice, boolean cookVegetable, int price, String meat) {
		super(name, rice, cookVegetable, price, meat);
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.cookVegetable = cookVegetable;
		this.rice = rice;

	}

	public void curryFlavour() {
		System.out.println(this.name + " is a spicy and mild dish");
	}

	@Override
	public void foodOrigin() {
		System.out.println(this.name + " is an Caribbean food");

	}
}
