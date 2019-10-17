package labs;

import java.util.Scanner;

public class DailyRainfall {
	public static void main(String[] args) {
		
		double monRain, tuesRain, wedRain, thursRain, friRain, satRain, sunRain, weeklyRainfall, average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input the rainfall for monday: ");
		monRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for tuesday: ");
		tuesRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for wednesday: ");
		wedRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for thursday: ");
		thursRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for friday: ");
		friRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for saturday: ");
		satRain = keyboard.nextDouble();
		System.out.println("Input the rainfall for sunday: ");
		sunRain = keyboard.nextDouble();
		
		weeklyRainfall = monRain + tuesRain + wedRain + thursRain + friRain + satRain + sunRain;
		average = weeklyRainfall / 7;
		
		System.out.println("The weekly rainfall is " + weeklyRainfall);
		System.out.println("The average daily rainfall is " + average);
		
		keyboard.close();
	}

}
