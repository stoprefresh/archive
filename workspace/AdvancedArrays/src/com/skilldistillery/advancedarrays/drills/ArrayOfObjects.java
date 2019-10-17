package com.skilldistillery.advancedarrays.drills;

import com.skilldistillery.advancedarrays.drills.PopStar;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		PopStar myPopStars[] = new PopStar[4];
		
		PopStar will = new PopStar();
		will.name = "Will Smith";
		will.age = 50;
		will.alive = true;
		will.lyrics = "Wild Wild West, Jim West, desperado, rough rider\n" + 
				"No you don't want nada\n" + 
				"None of this, six-gunning this, brother running this,\n" + 
				"Buffalo soldier, look it's like I told ya\n" + 
				"Any damsel that's in distress\n" + 
				"Be out of that dress when she meet Jim West\n" + 
				"Rough neck so go check the law and abide\n" + 
				"Watch your step or flex and get a hole in your side\n" + 
				"Swallow your pride, don't let your lip react,\n" + 
				"You don't wanna see my hand where my hip be at,\n" + 
				"With Arthemus, from the start of this,\n" + 
				"Running the game, James West taming the West so remember the name\n" + 
				"Now who ya gonna call?\n";
		myPopStars[0] = will;
		
		PopStar joe = new PopStar();
		joe.name = "Joe Walsh";
		joe.age = 71;
		joe.alive = true;
		joe.lyrics = "I have a mansion, forget the price\n" + 
				"Ain't never been there, they tell me it's nice\n" + 
				"I live in hotels, tear out the walls\n" + 
				"I have accountants pay for it all\n" + 
				"They say I'm crazy but I have a good time\n" + 
				"I'm just looking for clues at the scene of the crime\n" + 
				"Life's been good to me so far\n";
		myPopStars[1] = joe;
		
		PopStar snoop = new PopStar();
		
		snoop.name = "Snoop Dogg";
		snoop.age =47;
		snoop.alive =true;
		snoop.lyrics = "Now, that, I got me some Seagram's gin, everybody got\n"
				+ "they cups, but they ain't chipped in. Now this types of shit,\n "
				+ "happens all the time, you got to get yours but fool I gotta get mine.\n "
				+ "Everything is fine when you listenin to the D-O-G I got the cultivating \n"
				+ "music that be captivating he, who listens, to the words that I speak.\n";
		myPopStars[2] = snoop;
		
		PopStar tupac = new PopStar();
		tupac.name = "Tupac Shakur";
		tupac.age = 25;
		tupac.alive = false;
		tupac.lyrics = "Pump ya fists if ya feel me, holla if ya hear me Learn to survive in the nine-tre'\n "
				+ "I make rhyme pay, others make crime pay Whatever it takes to live and stand Cause \n"
				+ "nobody else'll give a damn So we live like caged beasts Waitin for the \n"
				+ "day to let the rage free Still me, till they kill me I love it when they fear me\n";
		myPopStars[3] = tupac;
		
		allSing(myPopStars);
	} // End of Main

	public static void allSing(PopStar[] stars) {
		// Loop through the array and call each PopStar's sing() method.
		for(PopStar yeah : stars) {
			yeah.sing();
		}

	}

}
