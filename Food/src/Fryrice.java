
public class Fryrice extends Food {

	protected boolean eggs = true;

	public Fryrice(String name, String rice, boolean cookVegetable, int price, String meat) {
		super(name, rice, cookVegetable, price, meat);
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.cookVegetable = cookVegetable;
		this.rice = rice;
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
		System.out.println("This meal has " + this.rice + ", meat = " + this.meat + ", " + "cookVegetable = "
				+ this.cookVegetable + " and egg = " + this.eggs);

	}

}
