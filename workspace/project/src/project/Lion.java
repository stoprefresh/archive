package project;

public class Lion extends Carnivore {

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	public Lion(String name) {
		super(name);

	}

	@Override
	public void Animal(String name) {

	}

	@Override
	public void eat(int numFoods) {
		System.out.println("Before I eat I say....");
		makeNoise();
		System.out.println("That was some good " + numFoods);

	}

	@Override
	public void makeNoise() {
		System.out.println("ROARRRRRR!!!!!!");

	}

}
