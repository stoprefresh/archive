package com.skilldistillery.io.labs;

import java.io.*;
import java.util.*;

public class PlanetReader {

	public static void main(String[] args) {
		String fileName = "planets.txt";
		PlanetReader pr = new PlanetReader();
		ArrayList<Planet> planet;
		planet = pr.readPlanets(fileName);

		pr.checkArray(planet);

		pr.writePlanet("plantes.txt", planet);
		
		

	}

	private void writePlanet(String fileName, ArrayList<Planet> x) {

		try {
			PrintWriter pw = new PrintWriter(fileName);
			
			for(Planet planet : x) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(planet.getName());
				sb.append('\t');
				sb.append(planet.getOrbit());
				sb.append('\t');
				sb.append(planet.getDiameter());
				pw.println(sb);
				
		
			}
			
			pw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	
	}

	private void checkArray(ArrayList<Planet> x) {
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i).toString() + ", " + x.get(i).getOrbit() 
					+ ", " + x.get(i).getDiameter() + "\n");
		}
	}

	private ArrayList<Planet> readPlanets(String fileName) {
		
		ArrayList<Planet> nP = new ArrayList<>();
		String line;

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {

				nP.add(new Planet(line.split(", ")[0], Long.parseLong(line.split(", ")[1])
						, Integer.parseInt(line.split(", ")[2])));
			}
			fr.close();
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		return nP;
	}
}
