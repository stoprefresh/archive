package drills;

public class SphereWithColorTest {

  public static void main(String[] args) {
    // Create several SphereWithColor reference variables
    // and new objects.
	  SphereWithColor greenSph = new SphereWithColor();
	  SphereWithColor redSph = new SphereWithColor();
	 
    // Initialize each object's color and radius fields.
	  redSph.color = "Red";
	  redSph.radius = 2.0;
	  
	  greenSph.color = "Green";
	  greenSph.radius = 4.0;
	  
	  SphereWithColor copySph = greenSph;
	  
	  redSph.displaySphere();
	  greenSph.displaySphere();
	  copySph.displaySphere();
	  
    // Call displaySphere for each object.

    // Create another SphereWithColor, but do not initialize its fields.
    // Call its displaySphere method. What values do you see?
  }

}
