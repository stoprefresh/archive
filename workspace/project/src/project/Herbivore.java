package project;

public abstract class Herbivore extends Animals {
	
	
	public Herbivore () {
		super();
	}
	
	public Herbivore(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + getName();
	}
	
	public void eat(int numFoods) {
		System.out.println("Im " + getName() + numFoods + " plants.");
	}
	
}
	
	
	
	
	
	
	
	
	
