package labs;

public class CarTester {

	public static void main(String[] args) {

		Car oldSchool = new Car();
		oldSchool.make = "Chevy";
		oldSchool.model = "Chevelle 71'";
		oldSchool.color = "Red";
		oldSchool.numberOfWheels = 4;
		oldSchool.purchasePrice = 16500.00;
		oldSchool.vinNum = "1HGBH41JXMN10186";

		Car truck = new Car();
		truck.make = "GMC";
		truck.model = "Sierra 19'";
		truck.color = "White";
		truck.numberOfWheels = 4;
		truck.purchasePrice = 51298.00;
		truck.vinNum = "3IGAN43LXKQ13491";

		oldSchool.displayCar();
		System.out.println();
		truck.displayCar();

	}
}
