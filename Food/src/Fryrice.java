
public class Fryrice extends Food {

	protected boolean eggs = true;

	public Fryrice(String name, String rice, boolean vegetable, int price, String meat) {
		super(name, rice, vegetable, price, meat);
		this.cookVegetable = true;
		this.eggs = true;
		this.price = 5;
		this.rice = "rice";
		this.name = "Fry Rice";
		this.meat = "no meat";

	}

	public void fryFlavour() {
		System.out.println(this.name + " is a spicy dish");
	}

	@Override
	public void foodOrigin() {
		System.out.println(this.name + " is an oriental food");

	}

	@Override
	public void ingredients() {
		System.out.println("This meal has " + this.rice + ", " + this.meat + ", " + "cookVegetable = "
				+ this.cookVegetable + " and egg = " + this.eggs);

	}

}
