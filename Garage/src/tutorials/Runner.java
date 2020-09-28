package tutorials;

public class Runner {

	public static void main(String[] args) {
		// System.out.print("Hello World");
		Vehicle trucki = new Truck("Loader Truck", 2, 2, "Green", 12, 10);
		Vehicle cari = new Car("Sports Car", 0, 4, " Black & Gold", 4, 5);
		Vehicle bikei = new Motorcycle("Ninja Brike", 0, 0, "Brown", 2, 1);

		// add vehicle to the garage
		Garage garage = new Garage();
		garage.addVehicle(trucki);
		garage.addVehicle(cari);
		garage.addVehicle(bikei);

		// garage.bill();

		// Looking at vehicle in the garage

		System.out.println("All the cars are in the garage " + garage + " and the bill is £" + garage.bill());

		// Remove motorcycle

		// Recommended method

		// garage.removeEach1("Car");

		// Show garage after removing motor cycle
		garage.removeEach("Motorcycle");
		System.out.println("\n" + garage);

		System.out.println("\n" + " I have taken the Motorcycle for a ride");

	}

}
