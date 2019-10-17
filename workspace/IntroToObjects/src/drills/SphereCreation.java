package drills;

public class SphereCreation {

	public static void main(String[] args) {

		// Create three Sphere "objects."

		Sphere baseball = new Sphere();
		baseball.radius = 3.7;
		// 1. A baseball, radius 3.7

		Sphere basketball;
		basketball = new Sphere();
		basketball.radius = 12.0;
		// 2. A basketball, radius 12.0

		Sphere mercury = new Sphere();
		mercury.radius = 244_000_000.0;
		// 3. Mercury, radius 244 million centimeters
		// Try writing this as 244_000_000.0 or 244e5

		System.out.println("Baseball volume is : " + baseball.getVolume());

		System.out.println("Basketball volume is  : " + basketball.getVolume());

		System.out.println("Mercury volme is : " + mercury.getVolume());
		// Print each object's volume to the screen using System.out.println.

	}

}
