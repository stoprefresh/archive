package com.skilldistillery.regex.drills;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {
  public static void main(String[] args) {
    Splitter s = new Splitter();
    List<Pet> pets = s.parseFile("pets.txt");
    for (Pet pet : pets) {
      System.out.println(pet);
    }
  }

  private List<Pet> parseFile(String fileName) {
    List<Pet> pets = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line = br.readLine(); // Read and discard header line
      //id,  name  color breed age gender  comments
      while ((line = br.readLine()) != null) {
    	  
    	  String[] x = line.split(",?\t");
    	  
    	  int id = Integer.parseInt(x[0]);
    	  String name = x[1];
    	  String color = x[2];
    	  String breed = x[3];
    	  int age = Integer.parseInt(x[4]);
    	  String gender = x[5];
    	  String comments = x[6];
    	  
    	  Pet pet = new Pet(id, name, color, breed, age, gender, comments);
    	 
    	  pets.add(pet);
    	
  		

      }
      br.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return pets;
  }

}
