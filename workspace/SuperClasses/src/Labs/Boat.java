package Labs;

public class Boat extends Vehicle {
  protected String name;
  protected double speedInKnots;
  protected int lengthInFeet;
  
  public Boat() {
    
  }
  
  public Boat(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
    super(purchasePrice);
    this.name = name;
    this.speedInKnots = speedInKnots;
    this.lengthInFeet = lengthInFeet;
  }
  
  public String toString() {
    return "Boat [purchasePrice = " + getPurchasePrice() + ", name = " + name + ", speedInKnots = " + speedInKnots
        + ", lengthInFeet = " + lengthInFeet + "] ";
  }
}
