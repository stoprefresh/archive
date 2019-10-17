package project;

public abstract class Carnivore extends Animals{

	
	
	public Carnivore() {
		super();
	}
	
	public Carnivore(String name) {
		super(name);
	}
	
	public Animals eat(Animals a) {
		
		System.out.println("I am eating a " + getClass().getSimpleName() 
				+ " named " + a.getName());
		
		return null;
	}
	
	
}
