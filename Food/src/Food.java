
public class Food {

	protected String name;
	protected String rice;
	protected String meat;
	protected boolean cookVegetable;
	protected int price;

	public Food(String name, String rice, boolean cookVegetable, int price, String meat) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.cookVegetable = cookVegetable;
		this.rice = rice;

	}

	public String getFoodname() {
		return name;
	}

	public void setFoodname(String name) {
		this.name = name;
	}

	public int getFoodprice() {
		return price;
	}

	public void setFoodprice(int price) {
		this.price = price;
	}

	public boolean getcookVegetable() {
		return cookVegetable;
	}

	public void setcookVegetable(boolean cookVegetable) {
		this.cookVegetable = cookVegetable;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public void foodOrigin() {
		System.out.println("This should tell you the food type food");

	}

	public void ingredients() {
		System.out.println("This meal has " + this.rice + "(, meat =  " + this.meat + ", " + "and cookVegetable = "
				+ this.cookVegetable + ")");
	}
}
