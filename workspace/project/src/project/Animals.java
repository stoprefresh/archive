package project;



public abstract class Animals {

	private String name;

	public Animals() {}
	
	public Animals(String name) {
		
	}

	abstract public void Animal(String name);
	
	abstract public void eat(int numFoods);
	
	public abstract void makeNoise();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
