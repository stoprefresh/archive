package com.skilldistillery.mapinterface.drills;
import java.util.*;
public class UsingHashMap {

  public static void main(String[] args) {
    UsingHashMap uhm = new UsingHashMap();
    uhm.launch();
  }

  private void launch() {
    // Declare and instantiate a map to hold Integer--->String key-value pairs
    Map<Integer, String> m = new HashMap<>();
    
    m.put(1, "George Washington");
    m.put(16, "Abraham Lincoln");
    m.put(32, "Franklin D. Roosevelt");
    m.put(36, "Lyndon B. Johnson");
    m.put(44, "Barack Obama");
    // Put these pairs in the map
    // 1  George Washington
    // 16 Abraham Lincoln
    // 32 Franklin D. Roosevelt
    // 36 Lyndon B. Johnson
    // 44 Barack Obama
    System.out.println(m);
    // Get the value for key 16 and output the key and value to the screen
    System.out.println(m.get(16));
    // Get the value for key 37 and output the key and value to the screen
    System.out.println(m.get(37));
    // Get the value for key 36 and output the key and value to the screen.
    System.out.println(m.get(36));
    // Iterate through the Map and output the key-value pairs in the format
    // key[tab][tab]value
    
    Set<Integer> s = m.keySet();
    
    Iterator<Integer> it = s.iterator();
    
    while(it.hasNext()) {
    	Integer x = it.next();
    	System.out.println(m.get(x));
    }
    
    for (Integer cur : s) {
    	System.out.println(m.get(cur));
		
	}
    
  }

}
