package Sanctuary;

import project.Animals;
import project.Carnivore;
import project.Elephant;
import project.Herbivore;
import project.Hippo;


public class Attendant {

	// feed all animals
	public void doRounds(Animals[] arr) {
		for (Animals animal : arr) {
			// make sure this animal is non-null
			if(animal != null) {
				feedAnimal(animal);	
			}
			else {
				break;
			}	
		}
	}
	
	
	// feed an animal
	public void feedAnimal(Animals a) {
		if(a instanceof Herbivore) {
			System.out.println("Gonna feed this feller plants!");
		}
		else if(a instanceof Carnivore) {
			System.out.println("We got the meats");
		}
		
		if(a instanceof Elephant || a instanceof Hippo) {
			a.eat(100);
		}
		else {
			a.eat(20);
		}
	}
}
