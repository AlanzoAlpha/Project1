import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Fryrice fryRice = new Fryrice("Fryrice", "rice", true, 5, "Non");

		Currygoat curryGoat = new Currygoat("Curry Goat", "rice", true, 10, "goat");

		Lambrice lambRice = new Lambrice("Lamb Rice", "rice", true, 10, "Lamb");

		lambRice.LambFlavour();
		curryGoat.curryFlavour();
		fryRice.fryFlavour();
		fryRice.getFoodprice();
		curryGoat.getFoodprice();
		lambRice.getFoodprice();
		fryRice.foodOrigin();
		fryRice.ingredients();

		int price = 0;

		ArrayList<Food> foodprice = new ArrayList<>();

		foodprice.add(fryRice);
		foodprice.add(curryGoat);
		foodprice.add(curryGoat);

		for (Food total : foodprice) {
			price = price + total.getFoodprice();
		}
		System.out.println("Your bill is " + price);

	}
}
