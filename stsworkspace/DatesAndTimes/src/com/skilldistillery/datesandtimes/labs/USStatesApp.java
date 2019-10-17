package com.skilldistillery.datesandtimes.labs;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class USStatesApp {

  public static void main(String[] args) {
    USStatesApp app = new USStatesApp();
    app.launch();

  }

  private void launch() {
    String fileName = "states.tsv";
    Map<String, USState> states = loadStatesMapFromFile(fileName);
    USState co = states.get("CO");
    System.out.println(co);

  }
  
  private Map<String, USState> loadStatesMapFromFile(String fileName) {
     Map<String, USState> states = new HashMap<>(67);
     DateTimeFormatter convertedDate = DateTimeFormatter.ofPattern("MMM d yyyy");

    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String record = null;
      while ((record = br.readLine()) != null) {
        String[] fields = record.split("\t");
        String abbr = fields[0];
        String name = fields[1];
        String capital = fields[2];
        LocalDate admitDate = LocalDate.parse(fields[3], convertedDate);
        int population = Integer.parseInt(fields[4]);

        USState state = new USState(abbr, name, capital, admitDate, population);
        states.put(abbr, state);
        br.close();

      }
    }
    catch (FileNotFoundException e) {
      System.err.println("File [" + fileName + "] not found.");
      return null;
    }
    catch (IOException e) {
      System.err.println("Error reading data from " + fileName);
      e.printStackTrace();
      return null;
    }

    return states;
  }

}
