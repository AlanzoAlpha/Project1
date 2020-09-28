
public class Lambrice extends Food {

	public Lambrice(String name, String rice, boolean cookVegetable, int price, String meat) {
		super(name, rice, cookVegetable, price, meat);
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.cookVegetable = cookVegetable;
		this.rice = rice;

	}

	public void LambFlavour() {
		System.out.println(this.name + " is a mild and juicy dish");
	}

	@Override
	public void foodOrigin() {
		System.out.println(this.name + " is an Englisf dish");

	}
}
