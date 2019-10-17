package com.skilldistillery.regex.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        // Split each line into fields,
        // use the fields to construct a Pet object and add it to the list
        // Fields are separated by a tab that's optionally preceded by a comma.
        
        String[] fields = line.split(",?\t");
        Pet pet = new Pet(Integer.parseInt(fields[0]),
            fields[1], fields[2], fields[3],
            Integer.parseInt(fields[4]),
            fields[5], fields[6]
            );
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
