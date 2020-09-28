package tutorials;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);

	}

	// Calculating parking charges
	public int bill() {
		int billt = 0;
		for (Vehicle v : this.vehicles) {
			// System.out.println(v);
			billt += v.getPrice();

		}
		return billt;
	}

	public void removeEach(String type) {
		List<Vehicle> toExit = new ArrayList<>();
		if ("Car".equals(type)) {
			for (Vehicle i : this.vehicles) {
				if (i instanceof Car) {
					toExit.add(i);
				}
			}
		} else if ("Truck".equals(type)) {
			for (Vehicle i : this.vehicles) {
				if (i instanceof Truck) {
					toExit.add(i);
				}
			}
		} else if ("Motorcycle".equals(type)) {
			for (Vehicle i : this.vehicles) {
				if (i instanceof Motorcycle) {
					toExit.add(i);

				}
			}

		}
		this.vehicles.removeAll(toExit);
	}

	// Recommended method to remove vehicle compared to above.
	public void removeEach1(String type) {
		List<Vehicle> toExit1 = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toExit1.add(v);
			}

		}

		this.vehicles.removeAll(toExit1);

	}

	public String toString() {
		return "" + vehicles + "";
	}
}
