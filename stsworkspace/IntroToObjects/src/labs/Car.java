package labs;

public class Car {
	public String make, model, color, vinNum;
	public int numberOfWheels;
	public double purchasePrice;

	public String getCarData() {
		String totalCarData = "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nTotal Wheels: "
				+ numberOfWheels + "\nPurchase Price: $" + purchasePrice + "\nVin Number: " + vinNum;

		return totalCarData;
	}

	public void displayCar() {
		System.out.println(getCarData());
	}

}
