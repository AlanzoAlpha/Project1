
public class Lambrice extends Food {

	public Lambrice(String name, String rice, boolean vegetable, int price, String meat) {
		super(name, rice, vegetable, price, meat);
		this.cookVegetable = true;

		this.price = 8;
		this.rice = "rice";
		this.name = "Lamb Rice";
		this.meat = "goat";

	}

	public void LambFlavour() {
		System.out.println(this.name + " is a mild and juicy dish");
	}

	@Override
	public void foodOrigin() {
		System.out.println(this.name + " is an Englisf dish");

	}
}
