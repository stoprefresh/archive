package NameGenApps;

public class NameGen {

	public String[] firstName = { "The", "Tha", "Amazing", "Wonderful", "Cordial", "Impeccable", "Stylin'", "Shoutin'",
			"Armchair", "Argumentative", "Desperate", "Analagous", "Graduate", "Childish", "Annual", "Dogmatic",
			"Violent", "Expert", "Smilin'", "Drunken", "Structural", "Vulgar", "Foolish", "Mad", "Inspector", "Captain",
			"Colonel", "Lazy", "Solid", "Dynamic", "Angry", "Visual", "Exemplary", "Insane", "Arrogant", "Polymorphic",
			"Multidimensional" };

	public String[] lastName = { "Developer", "Ambassador", "Programmer", "Protector", "Funk", "Philosopher", "Monster",
			"Outsider", "Master", "Chieftain", "Despot", "Artist", "Creator", "Warrior", "Pupil", "Watcher",
			"Conqueror", "Mastermind", "Structure", "Wanderer", "Overlord", "Samurai", "Menace", "Clinician", "Doctor",
			"Leader", "Destroyer", "Commander", "Menace", "Specialist", "Exception", "Crusader", "CEO", "President",
			"Baller", "Carcinogen", "2D Array" };

	// a method that doesn't do anything, but compiles is called a stub
	public String makeFirstName(String name) {
//		int theIndex = (int)(Math.random() * firstName.length);
		int theIndex = 0;
		name = name.toUpperCase();
		
		char[] nameChars = name.toCharArray();
		for (int i = 0; i < nameChars.length; i++) {
			char c = nameChars[i];
			theIndex += c;
		}
		theIndex = theIndex % firstName.length;
		String newName = firstName[theIndex];
		return newName;
	}

	public String makeLastName(String name) {

		String result = null;
		int theIndex = 0;
		name = name.toUpperCase();
		
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			theIndex += c;
		}

		theIndex %= lastName.length;

		result = lastName[theIndex];

		return result;
	}
}
