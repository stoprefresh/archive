package com.skilldistillery.setinterface.project;

import java.util.*;

public class SetTest {

  public static void main(String[] args) {
    SetTest st = new SetTest();
    st.launch();
  }
  
  public void launch() {
    Album al1 = new Album(1, "The Beatles", "The Beatles 1");
    Album al2 = new Album(2, "Prince", "The Very Best of Prince");
    Album al3 = new Album(3, "AC/DC", "Let There Be Rock");
    Album al4 = new Album(3, "AC/DC", "Let There Be Rock");
    
    Set<Album> albumCollection = new LinkedHashSet<>();
    
    System.out.println(albumCollection.add(al1));
    System.out.println(albumCollection.add(al2));
    System.out.println(albumCollection.add(al3));
    System.out.println(albumCollection.add(al4));
    
    
    printAlbums(albumCollection);
  }
  
  private void printAlbums(Set<Album> collection) {
    Iterator<Album> it = collection.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
