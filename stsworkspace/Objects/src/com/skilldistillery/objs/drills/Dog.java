package com.skilldistillery.objs.drills;

public class Dog {
  public String breed;
  public String name;
  public int weight;
  
  // Add a constructor with parameters to initialize breed and weight.
  public Dog(String b, int w) {
	  breed = b;
	  weight = w;
	  
  }
  // Add a constructor with parameters to initialize name, breed, and weight.
 public Dog(int w, String n, String b) {
	 breed = b;
	 weight = w;
	 name = n;
 }
  
  public void displayDogInfo() {
    System.out.println("Dog [breed= " + breed + ", name= " + name + ", weight= " + weight + "]");
  }

  public static void main(String[] args) {
    // Create three dog instances and call the displayDogInfo method on each Dog object.
	  Dog sparky = new Dog(55, "sparky", "lab/chow");
	  sparky.displayDogInfo();
	  
	  Dog miko = new Dog(30, "miko", "dachshund/beagle");
	  miko.displayDogInfo();
	  
	  
	  Dog nelly = new Dog(15, "nelly", "rat");
	  nelly.displayDogInfo();
	  
	  
  }

}
