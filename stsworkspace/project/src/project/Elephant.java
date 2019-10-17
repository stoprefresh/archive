package project;

public class Elephant extends Herbivore {

	public Elephant() {
		// TODO Auto-generated constructor stub
	}

	public Elephant(String name) {
		super(name);
	}
	
	
	public void Animal() {
		// TODO Auto-generated method stub

	}
	public void eat(int numFoods) {
		super.eat(numFoods);
		System.out.println("Using the 40,000 muscles in my trunk.");
	}

	@Override
	public void makeNoise() {
		System.out.println("Can you tell me if my name is " + getName() + "?");

	}

	@Override
	public void Animal(String name) {
		// TODO Auto-generated method stub
		
	}

}
