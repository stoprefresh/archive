package com.skilldistillery.mapinterface.labs;

import java.io.*;

import java.util.*;

public class AreaCodeLister {
  private Map<String, String> areaCodes;
  private Map<String, String> abbreviations;
  private Map<Integer, List<String>> namesSorted;

  public AreaCodeLister() {
//    populateAreaCodes();
//    populateAbbreviations();
	  nameSort();
//     print();
  }
  
  private void nameSort() {
	  namesSorted = new TreeMap<>();
	  int i = 0;
	  try (BufferedReader in = new BufferedReader(new FileReader(
		        "names.txt"))) {
		  
		  for(i = 0; i < 26; i++) {
			  List<String> record = new ArrayList<>();
			  namesSorted.put(i, record);
			  
		  }
		  
		  
		      String line = null;
		    	  
		      while ((line = in.readLine()) != null) {
		    	  char first = line.charAt(0);
		    	  int index = first - 65;
		    	  
		    	 namesSorted.get(index).add(line);
		    	 
		    	  
		    	  
		        // Add code to parse out the area code and abbreviation
		        // from each line. Then add them to the areaCodes Map.
		      }
		    }
		    catch (IOException e) {
		      System.err.println(e);
		      System.exit(1);
		    }
	  
	  		System.out.println(namesSorted);
		  }
	  
  
  
  
  private void populateAreaCodes() {
    areaCodes = new TreeMap<>();
     
    try (BufferedReader in = new BufferedReader(new FileReader(
        "areacodes.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {
    	  String [] record = line.split("\\t");
    	  areaCodes.put(record[0], record[1]);
    	  
    	  
        // Add code to parse out the area code and abbreviation
        // from each line. Then add them to the areaCodes Map.
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void populateAbbreviations() {
    abbreviations = new HashMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "abbreviations.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {
        String[] stateRecord = line.split("\\t");
        abbreviations.put(stateRecord[1], stateRecord[0]);
        
        // Add code to parse out the state and abbreviation
        // from each line. Then add them to the abbreviations
        // Map.
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void print() {
   
	  Iterator<String> ss = areaCodes.keySet().iterator();
	  
	  while((ss.hasNext())) {
		  String line = ss.next();
		  String fullName = abbreviations.get(areaCodes.get(line));
		  String areaC = areaCodes.get(line);
		  
		  
		  System.out.println(line + " : " + fullName + " : " + areaC);
	  }
	  
	  
  }

  public static void main(String[] args) {
    new AreaCodeLister();
    
    
    
  }
}



