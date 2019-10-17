package Sanctuary;

import project.Giraffe;
import project.Hippo;
import project.Lion;
import project.Elephant;

public class SanctuarySimulator {

	public static void main(String[] args) {
		Attendant att = new Attendant();
		Sanctuary sanc = new Sanctuary(10, att);
		
		sanc.addAnimal(new Giraffe("Bob"));
		sanc.addAnimal(new Lion("Larry"));
		sanc.addAnimal(new Hippo("The Hippo"));
		sanc.addAnimal(new Elephant("Dumpy"));
		
		
		
		sanc.startAttendantRound();
	}

}
