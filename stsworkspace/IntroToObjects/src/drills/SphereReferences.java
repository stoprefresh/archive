package drills;

public class SphereReferences {

  public static void main(String[] args) {
    Sphere sphRef;
    sphRef = new Sphere();
    sphRef.radius = 10.0;
    System.out.println("Original sphRef radius: " + sphRef.radius);
    // Create another reference called otherSphereRef and assign sphRef to it,
    // so that both references refer to the same Sphere object.
    System.out.println();
    Sphere otherSpherRef = sphRef;
    
    
    
    otherSpherRef.radius = 11.0;
    
    System.out.println(otherSpherRef.radius);
    System.out.println();
    System.out.println(sphRef.radius);

    
    System.out.println();
    
    System.out.println(sphRef.getVolume());
    System.out.println();
    System.out.println(otherSpherRef.getVolume());
    // Change otherSphereRef's radius.

    // Output otherSphereRef's radius to the screen.

    // Output sphRef's radius to the screen. It should have changed.
  }

}
