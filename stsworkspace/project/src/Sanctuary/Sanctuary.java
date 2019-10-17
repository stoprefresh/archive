package Sanctuary;

import project.Animals;

public class Sanctuary {

	private Attendant attendant;
	private Animals[] animals;

	public Sanctuary() {
		animals = new Animals[8];
	}

	public Sanctuary(Attendant a) {
		this();
		this.attendant = a;
	}

	public Sanctuary(int numAnimalSpaces) {
		animals = new Animals[numAnimalSpaces];
	}

	public Sanctuary(int numAnimals, Attendant attendant) {
		this(numAnimals);
		this.attendant = attendant;
	}

	public void addAnimal(Animals a) {

		for (int index = 0; index < animals.length; index++) {
			if (animals[index] == null) { // if I find a spot with no Animal there
				animals[index] = a;     //
				break;
			}
		}

	}
	
	public void startAttendantRound() {
		attendant.doRounds(animals);
	}
}
